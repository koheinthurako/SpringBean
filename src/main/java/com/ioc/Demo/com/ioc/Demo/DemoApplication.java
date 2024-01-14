package com.ioc.Demo.com.ioc.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring အကြောင်းစမယ်
// 1. IoC => ဘယ်ဟာတွေနဲ့ ဘယ်လိုတွေချိတ်ပြီးအလုပ်လုပ်ကြမလဲဆိုတဲ့ concept
// 2. Dependency Injection => အမှန်တကယ်ချိတ်ဆက်ပေးသည့် function

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Bean = Object
//		Object အားလုံးဆောက်တဲ့နေရာမှာသုံးတဲ့ Spring function => ApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ioc.Demo.com.ioc.Demo");
		
//		getBean ကတော့ ဆောက်ထားတဲ့ object တွေအားလုံးထဲက တစ်ခုကိုဆွဲထုတ်ပြီး type casting ပြောင်း object လုပ်
//		Time24 obj = (Time24) context.getBean("time24");
//		obj.showTime();
		
		TimeService timeObj = (TimeService) context.getBean("service");
		TimeService timeObj2 = (TimeService) context.getBean("service");
//		timeObj.show();
		System.out.println(timeObj);
		System.out.println(timeObj2);
		timeObj.setNum(5);
		System.out.println(timeObj);
		System.out.println(timeObj2);
		
		
	}

}
