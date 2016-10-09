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
	   //��װ�ļ������������������
		private String title;
		//��װ�ϴ��ļ��������
		private File upload;
		//��װ�ϴ��ļ����͵�����
		private String uploadContentType;
		//��װ�ϴ��ļ���������
		private String uploadFileName;
		//ֱ����struts.xml�ļ������õ�����
		private String savePath;
		public void setFruitName(String fruitname)
		{
			this.fruitname = fruitname;
		}
		//�����ϴ��ļ��ı���λ��
		private String getCategory() throws Exception
		{
			return this.category;
		}
		public void setCategory(String category)
		{
			this.category = category;
		}
		//�����ϴ��ļ��ı���λ��
		private String getFruitName() throws Exception
		{
			return this.fruitname;
		}
		public void setPrice(double price)
		{
			this.price = price;
		}
		//�����ϴ��ļ��ı���λ��
		private double getPrice() throws Exception
		{
			return this.price;
		}
		
		
		
		public void setSavePath(String value)
		{
			this.savePath = value;
		}
		//�����ϴ��ļ��ı���λ��
		private String getSavePath() throws Exception
		{
			return ServletActionContext.getServletContext()
				.getRealPath(savePath);
		}

		//�ļ������setter��getter����
		public void setTitle(String title)
		{
			this.title = title;
		}
		public String getTitle()
		{
			return (this.title);
		}

		//�ϴ��ļ���Ӧ�ļ����ݵ�setter��getter����
		public void setUpload(File upload)
		{
			this.upload = upload;
		}
		public File getUpload()
		{
			return (this.upload);
		}

		//�ϴ��ļ����ļ����͵�setter��getter����
		public void setUploadContentType(String uploadContentType)
		{
			this.uploadContentType = uploadContentType;
		}
		public String getUploadContentType()
		{
			return (this.uploadContentType);
		}

		//�ϴ��ļ����ļ�����setter��getter����
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
			//�Է��������ļ������ַ��ԭ�ļ��������ϴ��ļ������
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
		
		
		
		
		
		
		

