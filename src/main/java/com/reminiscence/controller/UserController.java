package com.reminiscence.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reminiscence.domain.ResponseLoginInfoDTO;
import com.reminiscence.domain.SignUpDTO;
import com.reminiscence.domain.SigninDTO;
import com.reminiscence.domain.UserInfoStatusDTO;
import com.reminiscence.domain.UserVO;
import com.reminiscence.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController 
{
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Inject
	private UserService service;
	
	@RequestMapping(value="/signinPost", method=RequestMethod.POST)
	public @ResponseBody ResponseLoginInfoDTO signinPost(SigninDTO dto) throws Exception
	{
		UserVO vo = service.login(dto);
		//존재하지 않는 계정 - 로그인 실패
		if(vo == null)
		{
			return new ResponseLoginInfoDTO("loginfailure", null);
		}
		//로그인 성공
		return new ResponseLoginInfoDTO("loginsuccess", vo.getUname());
	}
	
	@RequestMapping(value="/signupPost", method=RequestMethod.POST)
	public @ResponseBody UserInfoStatusDTO signupPost(SignUpDTO dto) throws Exception
	{
		UserVO vo = service.loginCheck(dto);
		//존재하지 않는 계정 - 회원가입
		if(vo == null)
		{
			service.signup(dto);
			
			return new UserInfoStatusDTO("success");
		}
		return new UserInfoStatusDTO("alreadyexists");
	}
}