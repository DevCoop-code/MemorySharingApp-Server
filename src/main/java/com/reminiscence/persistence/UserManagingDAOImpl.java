package com.reminiscence.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.UserManagingVO;

@Repository
public class UserManagingDAOImpl implements UserManagingDAO
{
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.UserManagingMapper";
	
	@Override
	public UserManagingVO read(String uemail) throws Exception
	{
		return session.selectOne(namespace + ".read", uemail);
	}
	
	@Override
	public void delete(String uemail) throws Exception
	{
		session.delete(namespace + ".delete", uemail);
	}
	
	@Override
	public void deleteBoard(String email) throws Exception
	{
		session.delete(namespace + ".deleteBoard", email);
	}
	
	@Override
	public List<UserManagingVO> listAll() throws Exception
	{
		return session.selectList(namespace + ".listAll");
	}
}
