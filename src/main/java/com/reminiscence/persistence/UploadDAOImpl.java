package com.reminiscence.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.UploadDTO;

@Repository
public class UploadDAOImpl implements UploadDAO
{
	private static final Logger logger = LoggerFactory.getLogger(UploadDAOImpl.class);
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.UploadMapper";
	
	@Override
	public void insertMemoryData(UploadDTO dto) throws Exception
	{
		session.insert(namespace+".insertData", dto);
	}
}
