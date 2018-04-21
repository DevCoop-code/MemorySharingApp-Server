package com.reminiscence.domain;

public class SignUpDTO 
{
	private String uemail;
	private String upw;
	private String uname;
	
	public String getUemail() 
	{
		return uemail;
	}
	public void setUemail(String uemail) 
	{
		this.uemail = uemail;
	}
	public String getUpw() 
	{
		return upw;
	}
	public void setUpw(String upw) 
	{
		this.upw = upw;
	}
	public String getUname() 
	{
		return uname;
	}
	public void setUname(String uname) 
	{
		this.uname = uname;
	}
	@Override
	public String toString() 
	{
		return "LoginDTO [uemail=" + uemail + ", upw=" + upw + ", uname=" + uname + "]";
	}
}
