package com.reminiscence.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reminiscence.domain.NewAccountDTO;
import com.reminiscence.domain.SignUpDTO;
import com.reminiscence.domain.SigninDTO;
import com.reminiscence.domain.UserVO;
import com.reminiscence.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService
{
	@Inject
	private UserDAO dao;
	
	@Override
	public UserVO loginCheck(SignUpDTO dto) throws Exception
	{
		return dao.loginCheck(dto);
	}
	
	@Override
	public void signup(SignUpDTO dto) throws Exception
	{
		dao.signup(dto);
	}
	
	public UserVO login(SigninDTO dto) throws Exception
	{
		return dao.login(dto);
	}
	
	@Transactional
	@Override
	public boolean changepassword(SigninDTO dto, NewAccountDTO account_dto) throws Exception
	{
		UserVO vo = dao.login(dto);
		
		//아이디, 비밀번호가 잘못 됨
		if(vo == null)
		{
			System.out.println("잘못된 계정");
			return false;
		}else	//아이디, 비밀번호가 옳음
		{
			System.out.println("옳은 계정");
			dao.changePasswordData(account_dto);
			return true;
		}
	}
	
	@Override
	public UserVO accountCheck(String id) throws Exception
	{
		return dao.accountCheck(id);
	}
}
