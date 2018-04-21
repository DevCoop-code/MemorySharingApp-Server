package com.reminiscence.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reminiscence.domain.NewAccountDTO;
import com.reminiscence.domain.SettingPasswordDTO;
import com.reminiscence.domain.SigninDTO;
import com.reminiscence.domain.UserInfoStatusDTO;
import com.reminiscence.service.UserService;

@Controller
@RequestMapping("/setting")
public class SettingController 
{
	private static final Logger logger = LoggerFactory.getLogger(SettingController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/changePassword", method=RequestMethod.POST)
	public @ResponseBody UserInfoStatusDTO changePassword(SettingPasswordDTO dto) throws Exception
	{
		logger.info("비밀번호 변경");
		
		SigninDTO signdto = new SigninDTO();
		signdto.setId(dto.getEmail());
		signdto.setPassword(dto.getPassword());
		
		logger.info("아이디 : " + dto.getEmail());
		logger.info("비밀번호 : " + dto.getPassword());
		logger.info("변경할 비밀번호 : " + dto.getNewpassword());
		
		NewAccountDTO account_dto = new NewAccountDTO();
		account_dto.setUemail(dto.getEmail());
		account_dto.setUpw(dto.getNewpassword());
		
		boolean result = service.changepassword(signdto, account_dto);
		
		if(result == true)
		{
			return new UserInfoStatusDTO("success");
		}
		else
		{
			return new UserInfoStatusDTO("fail");
		}
	}
}
