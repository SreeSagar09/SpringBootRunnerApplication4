package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationRunner1 implements ApplicationRunner, Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("From run method in CustomApplicationRunner1 class.");
	}

	@Override
	public int getOrder() {
		return 10;
	}

}
