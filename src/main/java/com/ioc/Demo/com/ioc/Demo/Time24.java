package com.ioc.Demo.com.ioc.Demo;

import org.springframework.context.annotation.Configuration;

// Configuration keyword ထည့်မှ object ဆောက်ပေးနိုင်တယ် 
@Configuration
public class Time24 implements TimeFormat {
	
	@Override
	public void showTime() {
		System.out.println("09:30:10");
	}

}
