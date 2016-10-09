package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="online_inf")
public class Online {
	@Id @Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String sessionID;
	private String username;
	private String userIP;
	private String resource;
	private long time;
	public Online(String sessionID ,  String username,String userIP,String resource,long time)
	{
		this.sessionID = sessionID;
		this.username = username;
		this.userIP = userIP;
		this.resource = resource;
		this.time = time;
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
	public String getSessionID()
	{
		return sessionID;
	}
	public void setSessionID(String sessionID)
	{
		this.sessionID = sessionID;
	}
	public String getUserIP()
	{
		return userIP;
	}
	public void setUserIP(String userIP)
	{
		this.userIP = userIP;
	}
	public String getResource()
	{
		return resource;
	}
	public void setResource(String resource)
	{
		this.resource = resource;
	}
	public long getTime()
	{
		return time;
	}
	public void setTime(long time)
	{
		this.time = time;
	}
	
	
	
	
}
