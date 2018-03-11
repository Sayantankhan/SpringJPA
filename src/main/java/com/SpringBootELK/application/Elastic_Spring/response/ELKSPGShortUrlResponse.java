package com.SpringBootELK.application.Elastic_Spring.response;

public class ELKSPGShortUrlResponse {
	
	private String status;
	private String shorterURL;
	private String availability;
	private String errors;
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getShorterURL() {
		return shorterURL;
	}
	public void setShorterURL(String shorterURL) {
		this.shorterURL = shorterURL;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	
}
