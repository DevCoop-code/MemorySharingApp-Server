package com.reminiscence.controller;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.reminiscence.domain.UploadDTO;
import com.reminiscence.domain.UserInfoStatusDTO;
import com.reminiscence.service.UploadService;
import com.reminiscence.util.MediaUtils;
import com.reminiscence.util.UploadFileUtils;

@Controller
public class UploadController 
{
	private static final Logger logger = LoggerFactory.getLogger(UploadController.class);
	
	@Resource(name = "uploadPath")
	private String uploadPath;
	
	@Inject
	private UploadService service;
	
	@RequestMapping(value = "/uploadForm", method=RequestMethod.POST)
	public @ResponseBody UserInfoStatusDTO memoryUpload(MultipartFile file, String description, String userid, String latitude, String longitude) throws Exception
	{
		logger.info("originalName : " + file.getOriginalFilename());
		logger.info("size : " + file.getSize());
		logger.info("contentType : " + file.getContentType());
		
		logger.info("description : " + description);
		logger.info("userid : " + userid);
		logger.info("latitude : " + latitude);
		logger.info("longitude : " + longitude);
		
		String uploadFilePath = UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), file.getBytes());
		
		logger.info("업로드된 파일의 썸네일 경로 : " + uploadFilePath);
		
		UploadDTO dto = new UploadDTO();
		dto.setImagepath(uploadFilePath);
		dto.setDescription(description);
		dto.setUemail(userid);
		dto.setLatitude(Double.parseDouble(latitude));
		dto.setLongitude(Double.parseDouble(longitude));
		
		service.insertMemoryData(dto);
		
		return new UserInfoStatusDTO("success");
	}
	
	@ResponseBody
	@RequestMapping(value = "/displayFile")
	public ResponseEntity<byte[]> displayFile(String fileName) throws Exception
	{
		InputStream in = null;
		ResponseEntity<byte[]> entity = null;
		
		logger.info("FILE NAME : " + fileName);
		
		try
		{
			String formatName = fileName.substring(fileName.lastIndexOf(".") + 1);
			
			MediaType mType = MediaUtils.getMediaType(formatName);
			
			HttpHeaders headers = new HttpHeaders();
			
			in = new FileInputStream(uploadPath+fileName);
			
			if(mType != null)
			{
				headers.setContentType(mType);
			}else	//파일이 이미지 파일이 아닌 경우
			{
				
			}
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			in.close();
		}
		
		return entity;
	}
}
