package com.cm.lcm2.service;

import java.util.List;

import com.cm.lcm2.VO.UserVO;

public interface UserService {
	
	String sendMail(String sEmail) throws Exception;
	
	UserVO save(UserVO user) throws Exception;
	List<UserVO> read(UserVO user) throws Exception;
	List<UserVO> readAll(String USER_ID) throws Exception;

}
