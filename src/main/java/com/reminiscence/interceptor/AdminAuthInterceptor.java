package com.reminiscence.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminAuthInterceptor extends HandlerInterceptorAdapter
{
	private static final Logger logger = LoggerFactory.getLogger(AdminAuthInterceptor.class);
	
	private static final String ADMIN = "admin";
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		HttpSession session = request.getSession();
		
		if(session.getAttribute(ADMIN) == null)
		{
			logger.info("current user is not admin");
			
			response.sendRedirect("/admin/login");
			return false;
		}
		return true;
	}
}
