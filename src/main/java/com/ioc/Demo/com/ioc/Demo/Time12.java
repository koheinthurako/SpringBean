package com.ioc.Demo.com.ioc.Demo;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Time12 implements TimeFormat {

	@Override
	public void showTime() {
		System.out.println("09:30:10 AM");
	}

}
