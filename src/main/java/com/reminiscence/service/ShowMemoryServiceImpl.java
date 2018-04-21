package com.reminiscence.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reminiscence.domain.MemoryDataDTO;
import com.reminiscence.persistence.ShowMemoryDAO;

@Service
public class ShowMemoryServiceImpl implements ShowMemoryService
{
	@Inject
	private ShowMemoryDAO dao;
	
	@Transactional
	@Override
	public List<MemoryDataDTO> selectMemoryData(double latitude, double longitude) throws Exception 
	{
		List<MemoryDataDTO> addedNameList = new ArrayList<>();
		
		List<MemoryDataDTO> list = dao.selectMemoryData(latitude, longitude);
		
		Iterator<MemoryDataDTO> memorydata_iter = list.iterator();
		while(memorydata_iter.hasNext())
		{
			MemoryDataDTO memory_data = memorydata_iter.next();
			
			String name_data = dao.emailToName(memory_data.getUemail());
			
			memory_data.setUname(name_data);
			
			addedNameList.add(memory_data);
		}
		
		return addedNameList;
	}
}
