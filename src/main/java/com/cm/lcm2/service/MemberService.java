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
	
	@Override
	public String sendMail(String email) throws Exception {
		
		String sAutoCode = getAutoCode();

		MailUtils sendMail = new MailUtils(mailSender);
        sendMail.setSubject("LCM 이메일 인증");
        sendMail.setText(new StringBuffer().append("<h1>[LCM 이메일 인증]</h1>")
									        .append("<h1>인증번호 : ")
									        .append(sAutoCode)
									        .append("</h1>")
									        .toString());
        sendMail.setFrom(mailSender.getUsername(), "LCM");
        sendMail.setTo(email);
        sendMail.send();
	    
		return sAutoCode;
	}
	
	public String getAutoCode() {
		
		Random random=new Random();
		int nAutoCode=random.nextInt(999999)+100000; //6자리 랜덤 정수를 생성
		
		//System.out.println("nAutoCode : " + nAutoCode);
		return toString().valueOf(nAutoCode);
	}

}
