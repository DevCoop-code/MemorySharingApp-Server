package com.reminiscence.domain;

import java.util.Date;

public class MemoryBoardVO 
{
    private Integer bno;
    private String uemail;
    private String imagepath;
    private String description;
    private double latitude;
    private double longitude;
    private Date regdate;
    
    public Integer getBno() 
    {
        return bno;
    }
    public void setBno(Integer bno) 
    {
        this.bno = bno;
    }
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
    public Date getRegdate() 
    {
        return regdate;
    }
    public void setRegdate(Date regdate) 
    {
        this.regdate = regdate;
    }
    @Override
    public String toString() 
    {
        return "MemoryBoardVO [bno=" + bno + ", uemail=" + uemail + ", imagepath=" + imagepath + ", description="
                + description + ", latitude=" + latitude + ", longitude=" + longitude + ", regdate=" + regdate + "]";
    }
}
