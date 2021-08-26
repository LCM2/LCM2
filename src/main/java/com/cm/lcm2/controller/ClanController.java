package com.cm.lcm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clan")
public class ClanController {

	@GetMapping("/teamList")
	public String teamList(Model model) {
		return "clan/teamList";
	}
	
	@GetMapping("/teamGnrt")
	public String teamGnrt(Model model) {
		return "clan/teamGnrt";
	}
	
}
