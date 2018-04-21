package com.reminiscence.domain;

public class RoundGPSDataDTO 
{
	double latitudedowner;
	double latitudeupper;
	double longitudedowner;
	double longitudeupper;
	
	public RoundGPSDataDTO(double latitudedowner, double latitudeupper, double longitudedowner, double longitudeupper)
	{
		this.latitudedowner = latitudedowner;
		this.latitudeupper = latitudeupper;
		this.longitudedowner = longitudedowner;
		this.longitudeupper = longitudeupper;
	}
	
	public double getLatitudedowner() {
		return latitudedowner;
	}
	public void setLatitudedowner(double latitudedowner) {
		this.latitudedowner = latitudedowner;
	}
	public double getLatitudeupper() {
		return latitudeupper;
	}
	public void setLatitudeupper(double latitudeupper) {
		this.latitudeupper = latitudeupper;
	}
	public double getLongitudedowner() {
		return longitudedowner;
	}
	public void setLongitudedowner(double longitudedowner) {
		this.longitudedowner = longitudedowner;
	}
	public double getLongitudeupper() {
		return longitudeupper;
	}
	public void setLongitudeupper(double longitudeupper) {
		this.longitudeupper = longitudeupper;
	}
	@Override
	public String toString() {
		return "RoundGPSDataDTO [latitudedowner=" + latitudedowner + ", latitudeupper=" + latitudeupper
				+ ", longitudedowner=" + longitudedowner + ", longitudeupper=" + longitudeupper + "]";
	}
}
