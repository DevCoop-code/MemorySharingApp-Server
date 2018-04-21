package com.reminiscence.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.reminiscence.domain.UploadDTO;
import com.reminiscence.persistence.UploadDAO;

@Service
public class UploadServiceImpl implements UploadService
{
	@Inject
	private UploadDAO dao;
	
	@Override
	public void insertMemoryData(UploadDTO dto) throws Exception
	{
		dao.insertMemoryData(dto);
	}
}
