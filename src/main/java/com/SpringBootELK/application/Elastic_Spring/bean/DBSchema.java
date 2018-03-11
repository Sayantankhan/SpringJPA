package com.SpringBootELK.application.Elastic_Spring.bean;

import javax.persistence.*;

@Entity
@Table(name = "tbl_shortUrl")
public class DBSchema {

	@Column(name = "id")
	private String id;
	@Column(name = "url")
	private String url;
	@Column(name = "description")
	private String description;
	
	public DBSchema(String id,String url, String description) {
		this.id = id;
		this.url = url;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
