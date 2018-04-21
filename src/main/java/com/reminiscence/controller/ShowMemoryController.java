package com.reminiscence.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reminiscence.domain.MemoryDataDTO;
import com.reminiscence.service.ShowMemoryService;

@Controller
public class ShowMemoryController 
{
	private static final Logger logger = LoggerFactory.getLogger(ShowMemoryController.class);
	
	@Inject
	private ShowMemoryService service;
	
	@RequestMapping(value="/showingMemory", method=RequestMethod.GET)
	public @ResponseBody List<MemoryDataDTO> showingMemory(double latitude, double longitude) throws Exception
	{
		logger.info("/showingMemory");
		return service.selectMemoryData(latitude, longitude);
	}
}
