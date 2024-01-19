package com.ioc.Demo.com.ioc.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

// Spring အကြောင်းစမယ်
// 1. IoC => ဘယ်ဟာတွေနဲ့ ဘယ်လိုတွေချိတ်ပြီးအလုပ်လုပ်ကြမလဲဆိုတဲ့ concept spring မှာ ဒါကိုအရင်သိရမယ်
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
//		တကယ်တော့ Bean create မယ်ဆိုရင် XML-based configuration, Java-based configuration, annotation-based ဆိုသုံးမျိုးရှိတယ်
//		AnnotationConfigApplicationContext() parameter ထဲမှာက package name ကိုမှန်အောင်ထည့်ပေးရမယ်
//		သူက အဲ့ဒီ package အောက်မှာရှိတဲ့ class တွေအားလုံးကို object ဆောက်ပေးနိုင်တယ် ဆောက်တဲ့အခါမှာတော့ @Configuration ကိုသုံးထားတဲ့
//		class တွေအကုန်လုံးက အောက်က context ထဲကိုဝင်သွားတယ် ဝင်တဲ့အခါ default အနေနဲ့ class name တွေက အစစာလုံးအသေးတွေပြောင်းသွားတယ်
//		ကိုယ်ဆောက်ချင်တဲ့ class ကို object ဆောက်တော့မယ်ဆိုရင်တော့ context.getBean() method ကိုအောက်ကလိုသုံးပေးရတယ်
		ApplicationContext context = new AnnotationConfigApplicationContext("com.ioc.Demo.com.ioc.Demo");
//		getBean ကတော့ @Configuration လို့ရေးထားတဲ့ class တွေကို ဆွဲထုတ်ပြီး object ဆောက်တဲ့နေရာမှာသုံးတယ်
//		ဆွဲထုတ်တဲ့အခါမှာ default class name က အသေးအနေနဲ့ပြန်ထုတ်ရမှာကို သတိထားရမယ် ကိုယ်တိုင်နာမည်ပြောင်းချင်ရင်တော့ () ထဲမှာရေးတယ်
//		တကယ် object ဆောက်ပေးတဲ့ function ကတော့ @Configuration က အမွေဆက်ခံထားတဲ့ @Component ဆိုတဲ့ interface
//		return type က ရိုးရိုး object ဆိုတော့ သက်ဆိုင်တဲ့ class object ဖြစ်အောင် type casting လုပ်ပြီး အောက်ကလိုပြန်ပြောင်းပေးရတယ်
//		Time24 obj = (Time24) context.getBean("tt24"); 
//		obj.showTime();
		
//		ဆိုတော့ အပေါ်ကလို class တွေဆွဲထုတ်ပြီး object ဆောက်နေမယ်ဆိုရင် code တွေအများကြီးရေးနေရမယ် ပြီးတော့ manage လုပ်ရတာ ခက်တယ်
//		object မှာတစ်ခုခု မှားသွားတာနဲ့ main program ကိုလာထိခိုက်စေနိုင်လို့ object တွေကိုအလွယ်တကူတစ်နေရာထဲကနေ control လုပ်ဖို့အတွက်
//		@Autowired ကိုသုံးတယ် သူ့ကို TimeService.java ထဲမှာသွားကြည့် ပြီးရင်တော့ အောက်ကလို အလွယ်တကူ object ဆောက် control လုပ်နိုင်သွားပြီ 
		
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
