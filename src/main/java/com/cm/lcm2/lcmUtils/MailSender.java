package com.cm.lcm2.lcmUtils;

import org.springframework.mail.javamail.JavaMailSender;

public interface MailSender extends JavaMailSender{

	public String getHost();
	public String getProtocol();
	public String getUsername();
	public String getPassword();
	public int getPort();
}
