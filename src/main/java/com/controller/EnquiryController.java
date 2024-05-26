package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class EnquiryController 
{
	@Autowired
	private HttpSession httpSession;
	
	@GetMapping("/logout")
	public String logout() 
	{
		httpSession.invalidate();
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dashboardPage() {
		return "dashboard";
	}
	
	@GetMapping("/enquiry")
	public String addEnquiryPage() {
		return "add-enquiry";
	}
	
	@GetMapping("/enquaries")
	public String viewEnquiryPage() {
		return "view-enquriy";
	}

}
