package com.reminiscence.persistence;

import com.reminiscence.domain.UploadDTO;

public interface UploadDAO 
{
	public void insertMemoryData(UploadDTO dto) throws Exception;
}
