package com.reminiscence.domain;

public class UploadDTO 
{
	private String uemail;
	private String imagepath;
	private String description;
	private double latitude;
	private double longitude;
	
	public String getUemail() 
	{
		return uemail;
	}
	public void setUemail(String uemail) 
	{
		this.uemail = uemail;
	}
	public String getImagepath() 
	{
		return imagepath;
	}
	public void setImagepath(String imagepath) 
	{
		this.imagepath = imagepath;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	public double getLatitude() 
	{
		return latitude;
	}
	public void setLatitude(double latitude) 
	{
		this.latitude = latitude;
	}
	public double getLongitude() 
	{
		return longitude;
	}
	public void setLongitude(double longitude) 
	{
		this.longitude = longitude;
	}
	@Override
	public String toString() 
	{
		return "UploadDTO [uemail=" + uemail + ", imagepath=" + imagepath + ", description=" + description
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
}
