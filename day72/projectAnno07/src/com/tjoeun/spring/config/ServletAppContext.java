package com.tjoeun.spring.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.tjoeun.spring.interceptor.TopMenuInterceptor;
import com.tjoeun.spring.mapper.BoardMapper;
import com.tjoeun.spring.mapper.TopMenuMapper;
import com.tjoeun.spring.service.TopMenuService;

//Spring MVC 프로젝트에 관련된 설정을 하는 클래스
//(servlet-context.xml)
@Configuration
//@Controller 어노테이션이 붙은 클래스를
//Controller 로 등록함
@EnableWebMvc // (<annotation-driven />)
//Scan 할 Bean 들이 모여있는 package 를 지정함
@ComponentScan(basePackages = {"com.tjoeun.spring.controller", 
                               "com.tjoeun.spring.dao",
                               "com.tjoeun.spring.service"})

@PropertySource("/WEB-INF/properties/db.properties")
public class ServletAppContext implements WebMvcConfigurer{
	
	@Value("${db.classname}")
	private String db_classname;
	
	@Value("${db.url}")
	private String db_url;
	
	@Value("${db.username}")
	private String db_username;
	
	@Value("${db.password}")
	private String db_password;
	
	// 주입받는 객체들은 Singleton으로 생성되어있음
	// 주입 받을 때마다 객체가 생성되는 것이 아니고
	// 이미 생성되어있는 객체의 주소만 주입받게 됨
	// 한 프로젝트에서 필요한 곳 어느 곳에서나
	// 주입 받아도 생성되어있는 한 객체의 주소를 주입받게 됨
	@Autowired
  private TopMenuService topMenuService;
	
  /*
    Controller 에서 return하는 문자열(경로)에
    접두사, 접미사 설정하기 
  */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/view/", ".jsp");
	}
	
  /*
    프로젝트에서 사용하는 정적 파일 경로 설정하기
    이미지, 사운드, 동영상, js, css 등 
  */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	// 데이터베이스 접속 정보를 관리하는 Bean
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName(db_classname);
		source.setUrl(db_url);
		source.setUsername(db_username);
		source.setPassword(db_password);
		return source;
	}
	
  // 쿼리문과 접속정보 관리 객체
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
  // 쿼리문 실행 객체 (Mapper 관리)
  // Mapper 등록하기 : BoardMapper
	@Bean
	public MapperFactoryBean<BoardMapper> getBoardMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<BoardMapper> factoryBean = new MapperFactoryBean<BoardMapper>(BoardMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
  // 쿼리문 실행 객체 (Mapper 관리)
  // Mapper 등록하기 : TopMenuMapper
	@Bean
	public MapperFactoryBean<TopMenuMapper> getTopMenuMapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<TopMenuMapper> factoryBean = new MapperFactoryBean<TopMenuMapper>(TopMenuMapper.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}
	
  // Interceptor 등록하기
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
    WebMvcConfigurer.super.addInterceptors(registry);
  	
  	TopMenuInterceptor topMenuInterceptor
  	 = new TopMenuInterceptor(topMenuService);
  	
  	InterceptorRegistration reg1
  	  = registry.addInterceptor(topMenuInterceptor);
  	// /** : 모든 요청의 주소에 대해서 interceptor가 동작함
  	reg1.addPathPatterns("/**");
	}
}


