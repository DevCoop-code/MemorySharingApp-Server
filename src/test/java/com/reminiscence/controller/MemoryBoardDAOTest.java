package com.reminiscence.controller;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.reminiscence.persistence.MemoryBoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemoryBoardDAOTest 
{
	@Inject
	private MemoryBoardDAO dao;
	
	private static final Logger logger = LoggerFactory.getLogger(MemoryBoardDAOTest.class);
	
	@Test
	public void testRead() throws Exception
	{
		logger.info(dao.read(1).toString());
	}	
}
