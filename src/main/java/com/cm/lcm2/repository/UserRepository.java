package com.cm.lcm2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.lcm2.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByUserId(String USER_ID);								//USER_ID로 SELECT
	List<User> findByUserNo(int USER_NO);									//USER_NO로 SELECT
	List<User> findByUserEmail(String USER_EMAIL);							//USER_EMAIL로 SELECT
	List<User> findByUserIdAndUserPw(String USER_ID, String USER_PW);		//USER_ID, USER_PW로 SELECT
}
