package action;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.opensymphony.xwork2.*;
import action.base.CustomerBaseAction;
import domain.Admin;
import domain.Customer;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class CustomerLoginAction extends CustomerBaseAction
{
	private static final int LOGIN_CUS = 0;
//	private static final int LOGIN_ADMIN = 2;

	private final String Cus_RESULT = "cus";



	private String key;
	private String a;
	private Customer customer;
//	private Admin admin;
	//private Admin admin;

	//private String vercode;

	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public Customer getCustomer()
	{
		return this.customer;
	}
/*	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}
	public Admin getAdmin()
	{
		return this.admin;
	}*/

	/*public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
	}*/

	
	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer)ctx.getApplication()
				.get("counter");
			if (counter == null)
			{
				counter = 1;
			}
			else
			{
				counter = counter + 1;
			}
			
			ctx.getApplication().put("counter" , counter);
			
			ctx.getSession().put("customer" , customer.getUserName());
		
			
			int result = customerservice.validLogin(getCustomer());
			
			if (result == LOGIN_CUS)
			{
				if("auto".equals(key)){
				Cookie customername = new Cookie("customername" , customer.getUserName());
				customername.setMaxAge(7*24*60*60);
				ServletActionContext.getResponse().addCookie(customername);
				
				Cookie customerpsw=new Cookie("customerpsw",customer.getPassword());
				customerpsw.setMaxAge(7*24*60*60);
				ServletActionContext.getResponse().addCookie(customerpsw);
				}
				ctx.getSession().put(WebConstant.USER
					, customer.getUserName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.CUS_LEVEL);
				
				return Cus_RESULT;
			}
			
	
			else
			{
		
				return ERROR;
			}
		}
	
	}
