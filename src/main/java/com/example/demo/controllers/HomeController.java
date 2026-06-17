package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("username","arsham");
		model.addAttribute("OnlineStatus",true);
		model.addAttribute("Users",344);
		model.addAttribute("XrayVersion","26.0.1");
		
		List<String> ListUsers=List.of(
				"ali",
				"mahan",
				"arsham",
				"sajad",
				"mohamad"
				);
		model.addAttribute("ListUsers",ListUsers);
		
		return "index";
	}
}
