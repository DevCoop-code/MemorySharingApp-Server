package com.reminiscence.domain;

public class NewAccountDTO 
{
	private String uemail;
	private String upw;
	
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
	
	@Override
	public String toString() 
	{
		return "NewAccountDTO [uemail=" + uemail + ", upw=" + upw + "]";
	}
}
