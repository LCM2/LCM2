package com.cm.lcm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IdRecognition {
	
	@GetMapping("/id")
	public String id(Model model){
		model.addAttribute("data","IdRecognition!!");
		return "IdRecognition";
	}

	

}
