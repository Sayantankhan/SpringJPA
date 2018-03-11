package com.SpringBootELK.application.Elastic_Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;

@Configuration
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan({ "com.SpringBootELK.application.Elastic_Spring.endpoint",
		"com.SpringBootELK.application.Elastic_Spring.bean", "com.SpringBootELK.application.Elastic_Spring.dao.impl"})
@EntityScan({"com.SpringBootELK.application.Elastic_Spring.bean","com.SpringBootELK.application.Elastic_Spring.bean"})
@EnableJpaRepositories("com.SpringBootELK.application.Elastic_Spring.repository")
public class Application {

	/*
	 * public void configure(WebSecurity web) throws Exception {
	 * web.ignoring().antMatchers("/becomeShort"); }
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
