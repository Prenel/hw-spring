package com.helloword.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.helloword.helloword.model.HelloWorld;
import com.helloword.helloword.service.BusinessService;

@Component
public class SysOut implements CommandLineRunner{

	@Autowired
	private BusinessService bs;
	
	@Override
	public void run(String... args) throws Exception {
		try { 
			HelloWorld hw = bs.getHelloWorld();
			System.out.println(hw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
