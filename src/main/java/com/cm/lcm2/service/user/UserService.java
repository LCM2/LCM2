package com.cm.lcm2.service.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cm.lcm2.VO.user.UserVO;

public interface UserService {

	String sendMail(String sEmail) throws Exception;

	UserVO save(UserVO user) throws Exception;
	UserVO findSameId(String userId) throws Exception;
	List<UserVO> readAll(String userId) throws Exception;
//	Page<UserVO> findUserList(Pageable pageabl) throws Exception;
	List<UserVO> findAll() throws Exception;
//	UserVO deleteUser(String userId) throws Exception;
	UserVO updateUser(UserVO user) throws Exception;

}
