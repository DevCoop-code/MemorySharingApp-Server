package com.reminiscence.service;

import com.reminiscence.domain.UploadDTO;

public interface UploadService 
{
	public void insertMemoryData(UploadDTO dto) throws Exception;
}
