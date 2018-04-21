package com.reminiscence.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.MemoryDataDTO;
import com.reminiscence.domain.RoundGPSDataDTO;

@Repository
public class ShowMemoryDAOImpl implements ShowMemoryDAO
{
	private static final Logger logger = LoggerFactory.getLogger(ShowMemoryDAOImpl.class);

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.ShowMemoryMapper";
	
	@Override
	public List<MemoryDataDTO> selectMemoryData(double latitude, double longitude) throws Exception 
	{
		double latitudedowner = latitude - 0.1;
		double latitudeupper = latitude + 0.1;
		double longitudedowner = longitude - 0.1;
		double longitudeupper = longitude + 0.1;
		
		return session.selectList(namespace + ".showmemory", new RoundGPSDataDTO(latitudedowner, latitudeupper, longitudedowner, longitudeupper));
	}

	@Override
	public String emailToName(String email) throws Exception 
	{
		return session.selectOne(namespace + ".selectname", email);
	}
}
