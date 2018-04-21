package com.reminiscence.persistence;

import com.reminiscence.domain.AdminDTO;
import com.reminiscence.domain.AdminVO;

public interface AdminDAO 
{
	public AdminVO login(AdminDTO dto) throws Exception;
}
