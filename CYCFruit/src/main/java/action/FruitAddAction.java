package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import action.base.AdminBaseAction;
import domain.Customer;
import domain.Fruit;
public class FruitAddAction extends AdminBaseAction{
	    private String fruitname;
	    private String category;
	    private double price;
	   //封装文件标题请求参数的属性
		private String title;
		//封装上传文件域的属性
		private File upload;
		//封装上传文件类型的属性
		private String uploadContentType;
		//封装上传文件名的属性
		private String uploadFileName;
		//直接在struts.xml文件中配置的属性
		private String savePath;
		public void setFruitName(String fruitname)
		{
			this.fruitname = fruitname;
		}
		//返回上传文件的保存位置
		private String getCategory() throws Exception
		{
			return this.category;
		}
		public void setCategory(String category)
		{
			this.category = category;
		}
		//返回上传文件的保存位置
		private String getFruitName() throws Exception
		{
			return this.fruitname;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		//返回上传文件的保存位置
		private double getPrice() throws Exception
		{
			return this.price;
		}
		
		
		
		public void setSavePath(String value)
		{
			this.savePath = value;
		}
		//返回上传文件的保存位置
		private String getSavePath() throws Exception
		{
			return ServletActionContext.getServletContext()
				.getRealPath(savePath);
		}

		//文件标题的setter和getter方法
		public void setTitle(String title)
		{
			this.title = title;
		}
		public String getTitle()
		{
			return (this.title);
		}

		//上传文件对应文件内容的setter和getter方法
		public void setUpload(File upload)
		{
			this.upload = upload;
		}
		public File getUpload()
		{
			return (this.upload);
		}

		//上传文件的文件类型的setter和getter方法
		public void setUploadContentType(String uploadContentType)
		{
			this.uploadContentType = uploadContentType;
		}
		public String getUploadContentType()
		{
			return (this.uploadContentType);
		}

		//上传文件的文件名的setter和getter方法
		public void setUploadFileName(String uploadFileName)
		{
			this.uploadFileName = uploadFileName;
		}
		public String getUploadFileName()
		{
			return (this.uploadFileName);
		}
		
		@Override
		public String execute() throws Exception
		{
			
			ActionContext ctx = ActionContext.getContext();
			//以服务器的文件保存地址和原文件名建立上传文件输出流
			FileOutputStream fos = new FileOutputStream(getSavePath()
				+ "\\" + getUploadFileName());
			FileInputStream fis = new FileInputStream(getUpload());
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0)
			{
				fos.write(buffer , 0 , len);
			}
			fos.close();
			Fruit fruit=new Fruit(fruitname,price,getSavePath(),category);
			int result = fruitservice.addFruit(fruit);
			if(result > 0)
			{	
			return SUCCESS;
			}
			else
			{
			
				return ERROR;
			}
			
		}
	}
		
		
		
		
		
		
		

