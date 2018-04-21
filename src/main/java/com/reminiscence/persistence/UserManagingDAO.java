package com.reminiscence.persistence;

import java.util.List;

import com.reminiscence.domain.UserManagingVO;

public interface UserManagingDAO 
{
	public UserManagingVO read(String uemail) throws Exception;
	
	public void delete(String uemail) throws Exception;
	
	public void deleteBoard(String email) throws Exception;
	
	public List<UserManagingVO> listAll() throws Exception;
}
