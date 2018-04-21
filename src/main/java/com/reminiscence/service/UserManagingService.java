package com.reminiscence.service;

import java.util.List;

import com.reminiscence.domain.UserManagingVO;

public interface UserManagingService 
{
	public UserManagingVO read(String uemail) throws Exception;
	
	public void remove(String uemail) throws Exception;
	
	public List<UserManagingVO> listAll() throws Exception;
}