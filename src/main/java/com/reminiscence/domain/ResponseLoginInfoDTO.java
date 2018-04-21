package com.reminiscence.domain;

public class ResponseLoginInfoDTO 
{
	private String status;
	private String username;
	
	public ResponseLoginInfoDTO(String status, String username)
	{
		this.status = status;
		this.username = username;
	}
	
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	@Override
	public String toString() 
	{
		return "ResponseLoginInfoDTO [status=" + status + ", username=" + username + "]";
	}
	
	
}
