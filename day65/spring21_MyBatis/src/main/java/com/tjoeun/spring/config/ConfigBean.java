package com.tjoeun.spring.config;


import java.sql.Connection;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tjoeun.spring.mapper.MapperInterface;


@Configuration
@ComponentScan(basePackages= "com.tjoeun.spring.bean")
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
	
	
	// SqlSessionFactory : JDBC를 처리하는 객체
	@Bean
	public SqlSessionFactory factory(BasicDataSource ds) throws Exception{
		
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		
		factoryBean.setDataSource(ds);
		SqlSessionFactory factory = factoryBean.getObject();
		
		return factory;
	}
 
	// Mapper
	@Bean
	public MapperFactoryBean<MapperInterface> getMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		
		factoryBean.setSqlSessionFactory(factory);
		
		return factoryBean;
	}
}
