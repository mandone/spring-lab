package com.mandone.ioc.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

	@Autowired
	private UserService userService;

	public void function() {
		System.out.println("index service method");
	}
}
