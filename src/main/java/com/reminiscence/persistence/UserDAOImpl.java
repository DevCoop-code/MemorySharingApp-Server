package com.reminiscence.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.reminiscence.domain.NewAccountDTO;
import com.reminiscence.domain.SignUpDTO;
import com.reminiscence.domain.SigninDTO;
import com.reminiscence.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO
{
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.reminiscence.mapper.LoginMapper";
	
	@Override
	public UserVO loginCheck(SignUpDTO dto) throws Exception
	{
		logger.info("email : " + dto.getUemail());
		logger.info("pw : " + dto.getUpw());
		logger.info("name : " + dto.getUname());
		return session.selectOne(namespace + ".logincheck", dto);
	}
	
	@Override
	public void signup(SignUpDTO dto) throws Exception
	{
		session.insert(namespace+".insertuser", dto);
	}
	
	@Override
	public UserVO login(SigninDTO dto) throws Exception
	{
		return session.selectOne(namespace+".login", dto);
	}
	
	@Override
	public void changePasswordData(NewAccountDTO dto) throws Exception
	{
		session.update(namespace+".changepassword", dto);
	}
	
	@Override
	public UserVO accountCheck(String id) throws Exception
	{
		return session.selectOne(namespace+".logincheck", id);
	}
}
