package com.cm.lcm2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.lcm2.model.User;
import com.cm.lcm2.repository.UserRepository;

import javassist.NotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//회원가입 [C]
	public User save(User user) {
		return userRepository.save(user);
	}
	
	//동일한 ID 찾기 [R]
	public List<User> read(String USER_ID) {
		return userRepository.findByUserId(USER_ID);
	}
	
	//유저 목록 조회 [R]
	public List<User> readAll(String USER_ID) {
		return userRepository.findAll();
	}
	
//	//유저 비밀번호 변경 [U]
//	public User updatePw(User user) {
//		List<User> userInfo = userRepository.findByUserId(user.getUSER_ID());
//		
//		if(!userInfo.isEmpty()) {
//			return userInfo.get(0).setUSER_PW(user.getUSER_PW());
//		}else {
//			throw new NotFoundException("리소스를 찾을 수 없습니다.");
//		}
//		return userRepository.findAll();
//	}
}
