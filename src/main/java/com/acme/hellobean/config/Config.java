package com.acme.hellobean.config;

import com.acme.hellobean.service.HelloService;
import com.acme.hellobean.service.impl.HelloFriendServiceImpl;
import com.acme.hellobean.service.impl.HelloWorldServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Value("${word}")
	private String word;

	@Bean
	public HelloService helloServiceImpl() {
		if ("friend".equalsIgnoreCase(word)) {
			return new HelloFriendServiceImpl();
		}
		return new HelloWorldServiceImpl();
	}
}
