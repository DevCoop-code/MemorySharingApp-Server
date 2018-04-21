package com.reminiscence.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.reminiscence.service.UserManagingService;

@Controller
@RequestMapping("/usermanaging/*")
public class UserManageController 
{
	private static final Logger logger = LoggerFactory.getLogger(UserManageController.class);
	
	@Inject
	private UserManagingService service;
	
	@RequestMapping(value = "/userListAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception
	{
		logger.info("show all user list...........");
		
		model.addAttribute("userlist", service.listAll());
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(@RequestParam("bno") String uemail, Model model) throws Exception
	{
		model.addAttribute(service.read(uemail));
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(@RequestParam("bno") String uemail, RedirectAttributes rttr) throws Exception
	{
		service.remove(uemail);
		
		rttr.addFlashAttribute("msg", "success");
		
		return "redirect:/usermanaging/userListAll";
	}
}
