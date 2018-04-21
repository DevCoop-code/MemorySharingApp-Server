package com.reminiscence.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AdminLoginInterceptor extends HandlerInterceptorAdapter
{
	private static final String ADMIN = "admin";
	private static final Logger logger = LoggerFactory.getLogger(AdminLoginInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		HttpSession session = request.getSession();
		
		if(session.getAttribute(ADMIN) != null)
		{
			logger.info("clear login data before");
			session.removeAttribute(ADMIN);
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object Handler, ModelAndView modelAndView) throws Exception
	{
		HttpSession session = request.getSession();
		
		ModelMap modelMap = modelAndView.getModelMap();
		Object adminVO = modelMap.get("adminVO");
		
		if(adminVO != null)
		{
			logger.info("admin login success");
			session.setAttribute(ADMIN, adminVO);
			response.sendRedirect("/admin/main");
		}
	}
}
