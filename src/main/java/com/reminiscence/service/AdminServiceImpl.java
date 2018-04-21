package com.reminiscence.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.reminiscence.domain.AdminDTO;
import com.reminiscence.domain.AdminVO;
import com.reminiscence.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService
{
	@Inject
	private AdminDAO dao;
	
	@Override
	public AdminVO login(AdminDTO dto) throws Exception
	{
		return dao.login(dto);
	}
}
