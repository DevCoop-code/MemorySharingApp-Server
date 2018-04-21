package com.reminiscence.persistence;

import java.util.List;

import com.reminiscence.domain.MemoryBoardVO;

public interface MemoryBoardDAO 
{
	public MemoryBoardVO read(Integer bno) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public List<MemoryBoardVO> listAll() throws Exception;
}
