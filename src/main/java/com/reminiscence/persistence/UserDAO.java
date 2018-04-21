package com.reminiscence.persistence;

import com.reminiscence.domain.NewAccountDTO;
import com.reminiscence.domain.SignUpDTO;
import com.reminiscence.domain.SigninDTO;
import com.reminiscence.domain.UserVO;

public interface UserDAO 
{
	public UserVO loginCheck(SignUpDTO dto) throws Exception;
	
	public void signup(SignUpDTO dto) throws Exception;
	
	public UserVO login(SigninDTO dto) throws Exception; 
	
	public void changePasswordData(NewAccountDTO dto) throws Exception;
	
	public UserVO accountCheck(String id) throws Exception;
}
