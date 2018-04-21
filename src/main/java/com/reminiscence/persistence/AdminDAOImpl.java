package com.reminiscence.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.AdminDTO;
import com.reminiscence.domain.AdminVO;

@Repository
public class AdminDAOImpl implements AdminDAO
{
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.AdminMapper";
	
	@Override
	public AdminVO login(AdminDTO dto) throws Exception
	{
		return session.selectOne(namespace + ".login", dto);
	}
}
