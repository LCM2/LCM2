package com.cm.lcm2.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cm.lcm2.lcmUtils.IMailSender;
import com.cm.lcm2.lcmUtils.MailUtils;

@Service
public class MemberService implements IMemberService {

	@Autowired
	private IMailSender mailSender;
	
	
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
		
		String sAutoCode = getAutoCode();

		MailUtils sendMail = new MailUtils(mailSender);
        sendMail.setSubject("LCM 이메일 인증");
        sendMail.setText(new StringBuffer().append("<h1>[LCM 이메일 인증]</h1>")
									        .append("<h1>인증번호 : ")
									        .append(sAutoCode)
									        .append("</h1>")
									        .toString());
        sendMail.setFrom(mailSender.getUsername(), "LCM");
        sendMail.setTo(sEmail);
        sendMail.send();
	    
		return sAutoCode;
	}
	
	/**
	 * Desc : 인증번호 6자리 숫자생성
	 * @Company : LCM
	 * @Date    : 2021. 9. 1. 오후 4:17:20
	 * @Author  : SuChan Kim
	 * @return
	 */
	public String getAutoCode() {
		
		Random random=new Random();
		int nAutoCode=random.nextInt(999999)+100000; //6자리 랜덤 정수를 생성
		
		//System.out.println("nAutoCode : " + nAutoCode);
		return toString().valueOf(nAutoCode);
	}

}
