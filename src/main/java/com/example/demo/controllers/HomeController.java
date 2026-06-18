package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.XrayStatusDto;
import com.example.demo.service.XrayStatusService;


@Controller
public class HomeController {
	private final XrayStatusService xrayStatusService;
	
	public HomeController(XrayStatusService xrayStatusService) {
		this.xrayStatusService=xrayStatusService;
	}
	
	@GetMapping("/")
	public String home(Model model) throws Exception {
		
		
		
		return "index";
	}
}
