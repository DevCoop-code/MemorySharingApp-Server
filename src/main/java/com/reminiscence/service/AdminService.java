package com.reminiscence.service;

import com.reminiscence.domain.AdminDTO;
import com.reminiscence.domain.AdminVO;

public interface AdminService 
{
	public AdminVO login(AdminDTO dto) throws Exception;
}
