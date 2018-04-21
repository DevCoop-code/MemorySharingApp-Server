package com.reminiscence.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.reminiscence.domain.MemoryBoardVO;
import com.reminiscence.persistence.MemoryBoardDAO;

@Service
public class MemoryBoardServiceImpl implements MemoryBoardService
{
	@Inject
	private MemoryBoardDAO dao;
	
	@Override
    public MemoryBoardVO read(Integer bno) throws Exception
    {
		return dao.read(bno);
    }
    
	@Override
    public void remove(Integer bno) throws Exception
    {
		dao.delete(bno);
    }
    
	@Override
    public List<MemoryBoardVO> listAll() throws Exception
    {
		return dao.listAll();
    }
}
