package com.cm.lcm2.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/recoveryPassword")
	public String recoveryPassword(Model model) {
		return "user/recoveryPassword";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "user/login";
	}
	
	@GetMapping("/agree")
	public String agree(Model model) {
		return "user/agree";
	}
	
	@GetMapping("/signUp")
	public String signUp(Model model) {
		return "user/signUp";
	}
	@GetMapping("/sendEmail")
	public String sendEmail(Model model) {
		return "user/sendEmail";
	}
	@GetMapping("/signUpDone")
	public String signUpDone(Model model) {
		return "user/signUpDone";
	}
	
}
