package com.SpringBootELK.application.Elastic_Spring.bean;

import javax.persistence.Entity;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class DatabaseConfigBean {

	@Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {

        return DataSourceBuilder.create().build();

    }
}
