package com.SpringBootELK.application.Elastic_Spring.dao.impl;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.SpringBootELK.application.Elastic_Spring.bean.DBSchema;
import com.SpringBootELK.application.Elastic_Spring.bean.DatabaseConfigBean;
import com.SpringBootELK.application.Elastic_Spring.dao.APPDataDao;
import com.SpringBootELK.application.Elastic_Spring.repository.URLRepository;

@Component
public class APPDataDaoImpl implements APPDataDao{
	
	@Autowired
	DatabaseConfigBean dbconfigBean;
	//private URLRepository urlrepository;

	@Override
	public void registerData(String url, String suggestedUrl, String description) {
		//urlrepository.save(new DBSchema(suggestedUrl,url,description));
		System.out.println("=============");
		try {
			System.out.println(dbconfigBean.dataSource().getConnection().isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void fetchData(String url_id) {
		// TODO Auto-generated method stub
		
	}

}
