package com.cm.lcm2.lcmUtils;

import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailSender extends JavaMailSenderImpl implements IMailSender {
	
	@Value("${spring.mail.smtp.auth}")
	private String propertiesMailSmtpAuth;
	
	@Value("${spring.mail.transport.protocol}")
	private String propertiesTransportProtocol;
	
	@Value("${spring.mail.smtp.starttls.enable}")
	private String propertiesMailSmtpStarttlsEnable;
	
	@Value("${spring.mail.smtp.starttls.required}")
	private String propertiesMailSmtpStarttlsRequired;
	
	@Value("${spring.mail.host}")
	private String host;

	@Value("${spring.mail.port}")
	private int port;

	@Value("${spring.mail.username}")
	private String username;

	@Value("${spring.mail.password}")
	private String password;
	
	private Properties properties = new Properties(); 
	
	@PostConstruct
	protected void postCunstruct() {
		initJavaMailProperties();
		setHost(host);
		setPort(port);
		setUsername(username);
		setPassword(password);
		setDefaultEncoding("utf-8");
		setJavaMailProperties(properties);
	}

	private void initJavaMailProperties() {
		properties.put("mail.smtp.auth", propertiesMailSmtpAuth);
		properties.put("mail.transport.protocol", propertiesTransportProtocol);
		properties.put("mail.smtp.starttls.enable", propertiesMailSmtpStarttlsEnable);
		properties.put("mail.smtp.starttls.required", propertiesMailSmtpStarttlsRequired);
	}
}
