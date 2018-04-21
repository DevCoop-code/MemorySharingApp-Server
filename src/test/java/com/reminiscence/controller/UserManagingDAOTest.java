package com.reminiscence.controller;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reminiscence.domain.UserManagingVO;
import com.reminiscence.persistence.UserManagingDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class UserManagingDAOTest 
{
	@Inject
	private UserManagingDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(UserManagingDAOTest.class);
	
	/*
	@Test
	public void testRead() throws Exception
	{
		logger.info(dao.read("cluedevil@naver.com").toString());
	}	
	*/
	
	@Test
	public void testListAll() throws Exception
	{
		List<UserManagingVO> list = dao.listAll();
		Iterator<UserManagingVO> iter = list.iterator();
		while(iter.hasNext())
		{
			UserManagingVO vo = iter.next();
			logger.info(vo.getUemail());
			logger.info(vo.getUname());
			logger.info(vo.getUprofile());
		}
		
	}
}
