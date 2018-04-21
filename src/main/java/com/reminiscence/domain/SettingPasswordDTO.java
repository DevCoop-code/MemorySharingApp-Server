package com.reminiscence.domain;

public class SettingPasswordDTO 
{
	private String email;
	private String password;
	private String newpassword;
	
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getNewpassword() 
	{
		return newpassword;
	}
	public void setNewpassword(String newpassword) 
	{
		this.newpassword = newpassword;
	}
	@Override
	public String toString() 
	{
		return "SettingPasswordDTO [email=" + email + ", password=" + password + ", newpassword=" + newpassword + "]";
	}
}
