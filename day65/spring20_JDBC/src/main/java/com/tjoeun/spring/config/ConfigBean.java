package com.tjoeun.spring.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


@Configuration
@ComponentScan(basePackages= {"com.tjoeun.spring.db", "com.tjoeun.spring.bean"})
public class ConfigBean {
	
	//DataSource <- BasicDataSource
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("tjoeun");
		source.setPassword("0000");
		return source;
	}
	
	
	//DB에 접속해서 쿼리(SQL)를 전달하는  bean을 등록함
	@Bean
	public JdbcTemplate db(BasicDataSource ds) {
		
		// data source (DB 접속 정보를 가지고 있는 객체 - DBCP)
		JdbcTemplate db = new JdbcTemplate(ds);
		
		
		return db;
	}
 
}
