package com.reminiscence.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reminiscence.domain.UserInfoStatusDTO;
import com.reminiscence.domain.UserVO;
import com.reminiscence.service.UserService;

@Controller
public class CheckController 
{
	private static Logger logger = LoggerFactory.getLogger(CheckController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
	public @ResponseBody UserInfoStatusDTO checkLogin(String id) throws Exception
	{
		logger.info("/checkLogin");
		UserVO vo = service.accountCheck(id);
		
		if(vo == null)
		{
			return new UserInfoStatusDTO("notexists_account");
		}
		return new UserInfoStatusDTO("exists_account");
	}
}
