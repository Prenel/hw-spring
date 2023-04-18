package com.helloword.helloword.service;

import org.springframework.stereotype.Component;

import com.helloword.helloword.model.HelloWorld;

@Component
public class BusinessService {

	public HelloWorld getHelloWorld()
	{
		return new HelloWorld();
	}
}
