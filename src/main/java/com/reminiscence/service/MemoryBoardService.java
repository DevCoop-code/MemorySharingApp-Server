package com.reminiscence.service;

import java.util.List;

import com.reminiscence.domain.MemoryBoardVO;

public interface MemoryBoardService 
{
	public MemoryBoardVO read(Integer bno) throws Exception;
	
	public void remove(Integer bno) throws Exception;
	
	public List<MemoryBoardVO> listAll() throws Exception;
}
