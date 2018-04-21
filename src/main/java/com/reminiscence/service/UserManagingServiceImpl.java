package com.reminiscence.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reminiscence.domain.UserManagingVO;
import com.reminiscence.persistence.UserManagingDAO;

@Service
public class UserManagingServiceImpl implements UserManagingService
{
	@Inject
	private UserManagingDAO dao;
	
	@Override
    public UserManagingVO read(String uemail) throws Exception
    {
		return dao.read(uemail);
    }
    
	@Transactional
	@Override
    public void remove(String uemail) throws Exception
    {
		dao.delete(uemail);
		dao.deleteBoard(uemail);
    }
    
	@Override
    public List<UserManagingVO> listAll() throws Exception
    {
		return dao.listAll();
    }
}
