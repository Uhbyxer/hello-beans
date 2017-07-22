package com.acme.hellobean.service.impl;

import com.acme.hellobean.service.HelloService;

public class HelloFriendServiceImpl implements HelloService {
	@Override
	public String sayHello() {
		return "Hello my friend";
	}
}
