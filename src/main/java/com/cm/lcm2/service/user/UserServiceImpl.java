package com.cm.lcm2.service.user;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.lcm2.dao.user.UserDAO;
import com.cm.lcm2.dao.user.UserJpaDAO;
import com.cm.lcm2.lcmUtils.MailSender;
import com.cm.lcm2.lcmUtils.MailUtils;
import com.cm.lcm2.vo.user.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserJpaDAO userJpaDAO;

	@Autowired
	private MailSender mailSender;
	
	@Autowired
	private UserDAO userDAO;


	/**
	 * Desc : 이메일 인증메일 발송
	 * @Company : LCM
	 * @Date    : 2021. 9. 1. 오후 4:17:26
	 * @Author  : SuChan Kim
	 * @param sEmail
	 * @return
	 * @throws Exception
	 */
	@Override
	public String sendMail(String sEmail) throws Exception {

		String sAuthCode = getAuthCode();

		MailUtils sendMail = new MailUtils(mailSender);
        sendMail.setSubject("LCM 이메일 인증");
        sendMail.setText(new StringBuffer().append("<h1>[LCM 이메일 인증]</h1>")
									        .append("<h1>인증번호 : ")
									        .append(sAuthCode)
									        .append("</h1>")
									        .toString());
        sendMail.setFrom(mailSender.getUsername(), "LCM");
        sendMail.setTo(sEmail);
        sendMail.send();

		return sAuthCode;
	}

	/**
	 * Desc : 인증번호 6자리 숫자생성
	 * @Company : LCM
	 * @Date    : 2021. 9. 1. 오후 4:17:20
	 * @Author  : SuChan Kim
	 * @return
	 */
	public String getAuthCode() {

		Random random=new Random();
		int nAutoCode=random.nextInt(999999)+100000; //6자리 랜덤 정수를 생성

		//System.out.println("nAutoCode : " + nAutoCode);
		return toString().valueOf(nAutoCode);
	}

	//회원가입 [C]
	@Override
	public UserVO save(UserVO user) throws Exception {
		return userJpaDAO.save(user);
	}

	//동일한 ID 찾기 [R]
	@Override
	public UserVO findSameId(String userId) throws Exception{
		return userJpaDAO.findByUserId(userId);
	}

//	//유저목록조회 [R]
//	@Override
//	public Page<UserVO> findUserList(Pageable pageabl) throws Exception{
//		return userJpaDAO.findUserList(pageabl);
//	}

	//유저목록조회 [R]
	@Override
	public List<UserVO> findAll() throws Exception{
		return userJpaDAO.findAll();
	}

	//유저 목록 조회 [R]
	@Override
	public List<UserVO> readAll(String USER_ID) throws Exception{
		return userJpaDAO.findAll();
	}

	//유저 정보 변경 [U]
	@Override
	public UserVO updateUser(UserVO user) throws Exception {
		return userJpaDAO.save(user);
	}

	@Override
	public List<UserVO> test() throws Exception {
//		UserVO user = new UserVO();
//		user.setUserNo(604);
//		user.setUserId("fvor001");
//		user.setUserPw("a1bd1312d23002be258c9bb4642bbea77580353869a8ee8844e6940b7e0278b7");
//		user.setUserEmail("fvor001@naver.com");
//		user.setUserAge(1994);
//		user.setUserNick("fvor001");
//		userDAO.insertTest(user);
//		userDAO.insertTest(user);
		return userDAO.test();
	}

//	//유저 목록 조회 [D]
//	@Override
//	public UserVO deleteUser(String userId) throws Exception{
//		return userJpaDAO.deleteById(userId);
//	}

}
