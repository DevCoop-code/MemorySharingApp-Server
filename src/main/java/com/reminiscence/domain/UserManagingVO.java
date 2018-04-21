package com.reminiscence.domain;

public class UserManagingVO 
{
	private String uemail;
	private String upw;
	private String uname;
	private String uprofile;
	
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
	public String getUprofile() 
	{
		return uprofile;
	}
	public void setUprofile(String uprofile) 
	{
		this.uprofile = uprofile;
	}
	@Override
	public String toString() 
	{
		return "UserManagingVO [uemail=" + uemail + ", upw=" + upw + ", uname=" + uname + ", uprofile=" + uprofile
				+ "]";
	}
}
