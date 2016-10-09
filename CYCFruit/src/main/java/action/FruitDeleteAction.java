package action;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionContext;

import action.base.AdminBaseAction;
import domain.Fruit;

public class FruitDeleteAction extends AdminBaseAction{
private int id;

public void setId(int id)
{
	this.id = id;
}
//返回上传文件的保存位置
private int getId() throws Exception
{
	return this.id;
}
@Override
public String execute() throws Exception
{	
	ActionContext ctx = ActionContext.getContext();
	//以服务器的文件保存地址和原文件名建立上传文件输出流
    fruitservice.deleteFruit(id);
	return SUCCESS;
	
}




}
