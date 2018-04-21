package com.reminiscence.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.reminiscence.domain.AdminDTO;
import com.reminiscence.domain.AdminVO;
import com.reminiscence.service.AdminService;

@Controller
@RequestMapping("/admin")
public class HomeController 
{
	@Inject
	private AdminService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void loginGET()
	{
		
	}
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void loginPOST(AdminDTO dto, HttpSession session, Model model) throws Exception
	{
		AdminVO vo = service.login(dto);
		
		if(vo == null)
			return;
		model.addAttribute("adminVO", vo);
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public void main() throws Exception
	{
		
	}
}
