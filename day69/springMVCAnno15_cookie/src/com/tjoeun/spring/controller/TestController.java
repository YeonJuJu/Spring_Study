package com.tjoeun.spring.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("saveCookie")
	public String saveCookie(HttpServletResponse response) {
		
		try {
			String str1 = URLEncoder.encode("지민", "UTF-8");
			String str2 = URLEncoder.encode("태형", "UTF-8");
			
			Cookie cookie1 = new Cookie("cookie1", str1);
			Cookie cookie2 = new Cookie("cookie2", str2);
			
			cookie1.setMaxAge(60*60); //1시간
			cookie2.setMaxAge(365*24*60*60); //1년
			
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "saveCookie";
	}

	@GetMapping("loadCookie")
	public String loadCookie(HttpServletRequest request) {
		
		try {
			Cookie[] cookies = request.getCookies();
			
			for(Cookie cookie : cookies) {
				String str = URLDecoder.decode(cookie.getValue(), "UTF-8");
			
				if(cookie.getName().equals("cookie1"))
					System.out.println("cookie1 : " + str);
				else
					System.out.println("cookie2 : " + str);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "loadCookie";
	}
	
	@GetMapping("loadCookie2")
	public String loadCookie2(@CookieValue("cookie1") String cookie1, @CookieValue("cookie2") String cookie2) {
		
		System.out.println("cookie1 : " + cookie1);
		System.out.println("cookie2 : " + cookie2);
		
		return "loadCookie2";
	}
}
