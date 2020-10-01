package com.mandone.ioc.main;

import com.mandone.ioc.IocConfiguration;
import com.mandone.ioc.bean.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(IocConfiguration.class);

		IndexService indexService = (IndexService)applicationContext.getBean("indexService");

		//
		indexService.function();
	}
}
