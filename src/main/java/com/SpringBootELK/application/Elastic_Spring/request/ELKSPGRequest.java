package com.SpringBootELK.application.Elastic_Spring.request;

public class ELKSPGRequest {

	private String url;
	private String description;
	private String suggestedUrl;
	
	public String getSuggestedUrl() {
		return suggestedUrl;
	}
	public void setSuggestedUrl(String suggestedUrl) {
		this.suggestedUrl = suggestedUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
