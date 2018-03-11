package com.SpringBootELK.application.Elastic_Spring.dao;

public interface APPDataDao {

	public void registerData(String url,String suggestedUrl, String description);
	
	public void fetchData(String url_id);
}
