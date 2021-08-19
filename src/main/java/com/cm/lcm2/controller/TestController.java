package com.cm.lcm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/chart")
	public String chart(Model model) {
		return "chart";
	}

	@GetMapping("/empty")
	public String empty(Model model) {
		return "empty";
	}

	@GetMapping("/form")
	public String form(Model model) {
		return "form";
	}

	@GetMapping("/index")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/table")
	public String table(Model model) {
		return "table";
	}
	
	@GetMapping("/teamList")
	public String teamList(Model model) {
		return "teamList";
	}
	
	@GetMapping("/teamGnrt")
	public String teamGnrt(Model model) {
		return "teamGnrt";
	}

}
