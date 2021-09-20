package com.cm.lcm2.DAO.user;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.lcm2.VO.user.UserVO;

public interface UserJpaDAO extends JpaRepository<UserVO, Long>{
	UserVO findByUserId(String userId);										//USER_ID로 SELECT
	List<UserVO> findByUserNo(int userNo);									//USER_NO로 SELECT
	List<UserVO> findByUserEmail(String userEmail);							//USER_EMAIL로 SELECT
	List<UserVO> findByUserIdAndUserPw(String userId, String userPw);		//USER_ID, USER_PW로 SELECT
//	Page<UserVO> findUserList(Pageable pageabl);							//
//	UserVO deleteById(String userId);										//USER_ID로 SELECT
}
