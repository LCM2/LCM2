package com.cm.lcm2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {

	@GetMapping("/recoveryPassword")
	public String recoveryPassword(Model model) {
		return "member/recoveryPassword";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "member/login";
	}
	
}
