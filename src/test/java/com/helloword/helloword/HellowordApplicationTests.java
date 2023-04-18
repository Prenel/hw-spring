package com.helloword.helloword;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.helloword.helloword.model.HelloWorld;
import com.helloword.helloword.service.BusinessService;

@SpringBootTest
class HellowordApplicationTests {

	@Autowired
	BusinessService bs;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void AssertHelloWorld()
	{
		String expected = "Hey man";
		HelloWorld hx = bs.getHelloWorld();
		
		assertEquals(hx.toString(), expected);
	}

}
