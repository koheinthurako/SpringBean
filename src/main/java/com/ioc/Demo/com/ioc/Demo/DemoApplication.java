package com.ioc.Demo.com.ioc.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

// Spring အကြောင်းစမယ်
// 1. IoC => ဘယ်ဟာတွေနဲ့ ဘယ်လိုတွေချိတ်ပြီးအလုပ်လုပ်ကြမလဲဆိုတဲ့ concept
// 2. Dependency Injection => အမှန်တကယ်ချိတ်ဆက်ပေးသည့် function
/*
 3. Spring Container and Their Types
	 Spring Program ကို စ run လိုက်တာနဲ့ spring server ထဲမှာ ကိုယ်ဆောက်ထားတဲ့ project တွေကိုထားတဲ့ container နှစ်နေရာရှိတယ်
	 အဲ့တာက BeanFactory and ApplicationContext 
	 - BeanFactory ကတော့ application စ run တဲ့အချိန်မှာ Object တွေတစ်ခါတည်းမဆောက်ပေးပဲနဲ့
	 object တစ်ခုကိုဆောက်ချင်ပါတယ်ဆိုပြီး request လုပ်မှ BeanFactory က ဆောက်ပေးတယ်
	 - ApplicationContext ကတော့ application စလိုက်တာနဲ့ ဆောက်ချင်တဲ့ object တွေကို တစ်ခါတည်းဆောက်ပေးစေချင်ရင်သုံးတယ်
*/

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Bean = Object
//		Spring မှာ object ဆောက်မယ်ဆိုရင် ရိုးရိုး java တုန်းကလို အများကြီး ရေးနေစရာမလိုပဲ အကုန်လုံးကိုဆောက်ပစ်နိုင်တယ်
//		Object အားလုံးဆောက်တဲ့နေရာမှာသုံးတဲ့ Spring function => ApplicationContext ရဲ့ (new AnnotationConfigApplicationContext)
//		AnnotationConfigApplicationContext() parameter ထဲမှာက package name ကိုမှန်အောင်ထည့်ပေးရမယ်
//		သူက အဲ့ဒီ package အောက်မှာရှိတဲ့ class တွေအားလုံးကို object ဆောက်ပေးနိုင်တယ် ဆောက်တဲ့အခါမှာတော့ @Configuration ကိုသုံးထားတဲ့
//		class တွေအကုန်လုံးက အောက်က context ထဲကိုဝင်သွားတယ် ဝင်တဲ့အခါ default အနေနဲ့ class name တွေက အစစာလုံးအသေးတွေပြောင်းသွားတယ်
//		ကိုယ်ဆောက်ချင်တဲ့ class ကို object ဆောက်တော့မယ်ဆိုရင်တော့ context.getBean() method ကိုအောက်ကလိုသုံးပေးရတယ်
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ioc.Demo.com.ioc.Demo");
//		getBean ကတော့ @Configuration သုံးထားတဲ့ class တွေကို ဆွဲထုတ်ပြီး object ဆောက်တဲ့နေရာမှာသုံးတယ်
//		return type က ရိုးရိုး object ဆိုတော့ သက်ဆိုင်တဲ့ class object ဖြစ်အောင် type casting လုပ်ပြီး အောက်ကလိုပြန်ပြောင်းပေးရတယ်
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
