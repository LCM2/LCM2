package com.cm.lcm2.DAO.clan;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.lcm2.VO.clan.ClanNoticeRepleVO;

public interface ClanNoticeRepleJpaDAO extends JpaRepository<ClanNoticeRepleVO, Long>{
//	List<UserVO> findByUserId(String userId);									//USER_ID로 SELECT
//	List<UserVO> findByUserNo(int userNo);										//USER_NO로 SELECT
//	List<UserVO> findByUserEmail(String userEmail);								//USER_EMAIL로 SELECT
//	List<UserVO> findByUserIdAndUserPw(String userId, String userPw);			//USER_ID, USER_PW로 SELECT
}
