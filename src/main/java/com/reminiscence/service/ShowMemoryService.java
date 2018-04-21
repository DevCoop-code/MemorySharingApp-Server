package com.reminiscence.service;

import java.util.List;

import com.reminiscence.domain.MemoryDataDTO;

public interface ShowMemoryService 
{
	//추억이 담겨있는 테이블에 접근해 데이터 가져오기
	public List<MemoryDataDTO> selectMemoryData(double latitude, double longitude) throws Exception;
}
