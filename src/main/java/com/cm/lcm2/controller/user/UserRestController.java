package com.cm.lcm2.controller.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cm.lcm2.VO.user.UserVO;
import com.cm.lcm2.service.user.UserService;

@RestController
@RequestMapping("/api/member")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/sendMail")
	public String sendMail() {
		
		//화면에서 받은 email
		String sEmail = "fvor001@naver.com";
		
		//화면에 보내줄 인증코드
		String sAutoCode = "";
		try {
			sAutoCode = userService.sendMail(sEmail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		return sAutoCode;
		return "member/login";
	}
	
	ResponseEntity<?> entity = null;
	// 추후 swagger 연동하여  Api Spec 문서 관리 예정
	// 회원가입
	@PostMapping("/save")
	public ResponseEntity<?> saveSignUp(@RequestBody UserVO user) {
		try {
			if(user != null) {
				userService.save(user);
				entity = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
			}else {
				entity = new ResponseEntity<String>("NO DATA", HttpStatus.BAD_REQUEST);
			}
		}catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	// 동일 ID 여부 조회
	@GetMapping("/read/{id}")
	public Optional<UserVO> read(@RequestParam String USER_ID){
		Optional<UserVO> user = null;
		
		if(USER_ID != null) {
//			user = userService.read(USER_ID);
		}
		
		return user;
	}
}
