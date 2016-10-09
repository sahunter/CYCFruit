package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionContext;

import action.base.AdminBaseAction;
import domain.Fruit;

public class FruitUpdateAction extends AdminBaseAction{
	private int id;
	private String fruitname;
    private String category;
    private double price;
    
    public void setFruitName(String fruitname)
	{
		this.fruitname = fruitname;
	}
	private String getFruitName() throws Exception
	{
		return this.fruitname;
	}
	private String getCategory() throws Exception
	{
		return this.category;
	}
	public void setCategory(String category)
	{
		this.category = category;
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
	public void setId(int id)
	{
		this.id = id;
	}
	//返回上传文件的保存位置
	private double getId() throws Exception
	{
		return this.id;
	}
	@Override
	public String execute() throws Exception
	{	
		ActionContext ctx = ActionContext.getContext();
		//以服务器的文件保存地址和原文件名建立上传文件输出流
	String	hql="update Fruit f set f.fruitname=?0 and f.price=?1 and f.category=?2 where f.id = ?3";
	/*	ArrayList arrlist=new ArrayList();
		arrlist.add(fruitname);
		arrlist.add(price);
		arrlist.add(category);
		arrlist.add(id);*/
	    fruitservice.updateFruitById(hql,fruitname,price,category,id);
		
		return SUCCESS;
		
	}
	
	
	
	
	
	
}
