package com.reminiscence.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.MemoryBoardVO;

@Repository
public class MemoryBoardDAOImpl implements MemoryBoardDAO
{
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.MemoryBoardMapper";
	
	@Override
    public MemoryBoardVO read(Integer bno) throws Exception
    {
		return session.selectOne(namespace+".read", bno);
    }
    
	@Override
    public void delete(Integer bno) throws Exception
    {
		session.delete(namespace+".delete", bno);
    }
    
	@Override
    public List<MemoryBoardVO> listAll() throws Exception
    {
		return session.selectList(namespace+".listAll");
    }
}
