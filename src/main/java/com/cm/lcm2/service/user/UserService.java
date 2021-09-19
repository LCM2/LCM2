package com.cm.lcm2.service.user;

import java.util.List;

import com.cm.lcm2.VO.user.UserVO;

public interface UserService {
	
	String sendMail(String sEmail) throws Exception;
	
	UserVO save(UserVO user) throws Exception;
	List<UserVO> read(UserVO user) throws Exception;
	List<UserVO> readAll(String USER_ID) throws Exception;

}
