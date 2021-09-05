package com.cm.lcm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cm.lcm2.model.Login;
import com.cm.lcm2.repository.LoginRepository;
import com.cm.lcm2.service.IMemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	private IMemberService memberService;
	
	@GetMapping("/recoveryPassword")
	public String recoveryPassword(Model model) {
		return "member/recoveryPassword";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		return "member/login";
	}
	
	@GetMapping("/agree")
	public String agree(Model model) {
		return "member/agree";
	}
	
	@GetMapping("/signUp")
	public String signUp(Model model) {
		return "member/signUp";
	}
	@GetMapping("/sendEmail")
	public String sendEmail(Model model) {
		return "member/sendEmail";
	}
	@GetMapping("/signUpDone")
	public String signUpDone(Model model) {
		return "member/signUpDone";
	}
	@PostMapping("/save")
	public Login saveSignUp(@RequestBody Login s) {
		return loginRepository.save(s);
	}
	@GetMapping("/sendMail")
	public String sendMail() {
		
		//화면에서 받은 email
		String sEmail = "fvor001@naver.com";
		
		//화면에 보내줄 인증코드
		String sAutoCode = "";
		try {
			sAutoCode = memberService.sendMail(sEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		return sAutoCode;
		return "member/login";
	}
	
}
