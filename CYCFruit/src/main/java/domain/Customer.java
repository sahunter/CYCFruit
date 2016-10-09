package domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
@Entity
@Table(name="customer_inf")
public class Customer {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="username")
	private String username;
	private String password;
	private String email;
	private String defaultAddress;
	private String newpassword;
	public Customer()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Customer(String name ,  String password,String email,String defaultAddress)
	{
		this.username = name;
		this.password = password;
		this.email = email;
		this.defaultAddress = defaultAddress;
	}
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
		this.id = id;
	}
	public String getUserName()
	{
		return username;
	}
	public void setUserName(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getDefaultAddress()
	{
		return defaultAddress;
	}
	public void setDefaultAddress(String defaultAddress)
	{
		this.defaultAddress = defaultAddress;
	}
	public String getNewPassword() {
        return newpassword;
    }
	 public void setNewPassword(String npsw) {
	        this.newpassword = npsw;
	    }
	
}
