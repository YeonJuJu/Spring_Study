package com.tjoeun.spring.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

import com.tjoeun.spring.dto.BoardInfoDTO;
import com.tjoeun.spring.service.TopMenuService;

public class TopMenuInterceptor implements HandlerInterceptor{

	
	private TopMenuService topMenuService;
	
	// interceptor에서는 자동주입으로 Bean을 주입받지 못하므로
	// interceptor에서 사용하는 객체들은
	// interceptor를 등록하는 곳에서
	// Bean을 주입받아서 생성자로 받아서 사용해야 함
	public TopMenuInterceptor(TopMenuService topMenuService) {
		this.topMenuService = topMenuService;
	}
	
	@Override
	public boolean preHandle
	(HttpServletRequest request, 
	 HttpServletResponse response, Object handler) throws Exception {
		
		List<BoardInfoDTO> topMenuList = topMenuService.getTopMenuList();
		request.setAttribute("topMenuList", topMenuList);
		
		return true;
	}

}
