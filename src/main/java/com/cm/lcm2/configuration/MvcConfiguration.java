package com.cm.lcm2.configuration;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cm.lcm2.interceptort.LoggerInterceptor;
import com.cm.lcm2.lcmUtils.MailSender;
import com.cm.lcm2.lcmUtils.MailSenderImpl;

@Configuration
@Import({
	DBConfiguration.class
})
public class MvcConfiguration implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")
				.addResourceLocations("classpath:/templates/", "classpath:/static/")
				.setCacheControl(CacheControl.maxAge(10, TimeUnit.MINUTES));
	}
	
	@Bean
	public MailSender mailSender() {
		return new MailSenderImpl();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoggerInterceptor());
	}
	
}
