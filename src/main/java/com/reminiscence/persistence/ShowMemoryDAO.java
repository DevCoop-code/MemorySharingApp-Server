package com.reminiscence.persistence;

import java.util.List;

import com.reminiscence.domain.MemoryDataDTO;

public interface ShowMemoryDAO 
{
	//추억이 담겨있는 테이블에 접근해 데이터 가져오기
	public List<MemoryDataDTO> selectMemoryData(double latitude, double longitude) throws Exception;
	//이메일 값을 이용해 이름값 가져오기
	public String emailToName(String email) throws Exception;
}
