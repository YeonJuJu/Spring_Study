package com.tjoeun.spring.config;

import javax.servlet.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
// (web.xml 역할)
public class ConfigSpring implements WebApplicationInitializer{

  @Override
  public void onStartup
  (ServletContext servletContext) throws ServletException {
    
    // System.out.println("onStartup() 호출됨");
    
    // Spring MVC 프로젝트에서 필요한 
    // 객체(ServletAppContext[servlet-context.xml])를 
    // Spring Container(IoC Container)가 자동으로
    // 생성하도록 설정하기
    
    AnnotationConfigWebApplicationContext servletAppContext = 
        new AnnotationConfigWebApplicationContext();
    servletAppContext.register(ServletAppContext.class);
    
     
//      현재 Application 에서 받아들이는
//      모든 요청(request) 에 대해서 
//      appServlet 이라고 정의되어있는
//      Servlet을 사용함
//      요청(request) 정보를 분석해서
//      Controller 를 선택하는 Servlet 지정하기
//      Spring MVC에서 제공하는 기본 Servlet을 지정함
//                                  <-- DispatcherServlet  
//      : DispatcherServlet 클래스의 객체를 생성하기                             
    
    
    DispatcherServlet dispatcherServlet = 
        new DispatcherServlet(servletAppContext);
    
    // DispatcherServlet 객체 등록하기
    ServletRegistration.Dynamic servlet = 
        servletContext.addServlet("dispatcher", dispatcherServlet);
    
    servlet.setLoadOnStartup(1);
    servlet.addMapping("/");
    
    // Bean을 정의하는 클래스(RootAppContext) 지정하기 
    AnnotationConfigWebApplicationContext rootAppContext = 
        new AnnotationConfigWebApplicationContext();
    rootAppContext.register(RootAppContext.class);
    
    // listener 설정하기
    // 1) listener 객체 생성하기
    ContextLoaderListener listener = 
        new ContextLoaderListener(rootAppContext);
    
    // 2) listener 객체 등록하기
    servletContext.addListener(listener);
    
    
    // 한글 처리를 위한  encoding filter
    FilterRegistration.Dynamic filter = 
        servletContext.addFilter
          ("encodingFilter", CharacterEncodingFilter.class);
    filter.setInitParameter("encoding", "UTF-8");
    filter.addMappingForServletNames(null, false, "dispatcher");
    
  }

}
*/

public class ConfigSpring extends AbstractAnnotationConfigDispatcherServletInitializer{

  
  // DispatcherServlet에 mapping 할 주소를 설정함 
  @Override
  protected String[] getServletMappings() {
    return new String[] {"/"};
  }
  
  // Spring MVC 에서 사용하는 클래스를 지정함
  // servlet-context.xml
  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[] {ServletAppContext.class};
  }

  // 프로젝트에서 사용하는 Bean들을 정의하는 클래스를 지정함
  // root-context.xml
  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[] {RootAppContext.class};
  }
  
  // 한글 처리를 위한  encoding filter
  @Override
  protected Filter[] getServletFilters() {
    
    CharacterEncodingFilter encodingFilter = 
        new CharacterEncodingFilter();
    encodingFilter.setEncoding("UTF-8");
    
    return new Filter[] {encodingFilter};
  }
  
  
}