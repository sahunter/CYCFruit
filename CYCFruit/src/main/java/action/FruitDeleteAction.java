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
//�����ϴ��ļ��ı���λ��
private int getId() throws Exception
{
	return this.id;
}
@Override
public String execute() throws Exception
{	
	ActionContext ctx = ActionContext.getContext();
	//�Է��������ļ������ַ��ԭ�ļ��������ϴ��ļ������
    fruitservice.deleteFruit(id);
	return SUCCESS;
	
}




}
