package action;

import com.opensymphony.xwork2.ActionContext;

import action.base.CustomerBaseAction;
import domain.Customer;

public class RegisterAction extends CustomerBaseAction{
	private Customer customer;
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public Customer getCustomer()
	{
		return this.customer;
	}
	public String execute()
			throws Exception
		{
			// ´´½¨ActionContextÊµÀý
			ActionContext ctx = ActionContext.getContext();
			int result = customerservice.addCustomer(getCustomer()); 
	if(result > 0)
	{	/*ActionContext.getContext().getSession()
		.put("customer" , customer.getUserName());

*/	return SUCCESS;
	}
	else
	{
	
		return ERROR;
	}
	
}
}