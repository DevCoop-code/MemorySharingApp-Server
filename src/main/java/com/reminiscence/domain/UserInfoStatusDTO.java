package com.reminiscence.domain;

public class UserInfoStatusDTO 
{
	private String status;

	public UserInfoStatusDTO(String status)
	{
		this.status = status;
	}
	
	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	@Override
	public String toString() 
	{
		return "UserInfoStatusDTO [status=" + status + "]";
	}
}
