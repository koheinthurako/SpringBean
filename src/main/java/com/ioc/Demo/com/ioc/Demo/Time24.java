package com.ioc.Demo.com.ioc.Demo;

import org.springframework.context.annotation.Configuration;

//	Spring မှာ Configuration keyword ထည့်မှ object ဆောက်ပေးနိုင်တယ်
//	တကယ်က Configuration က Component ကနေအမွေဆက်ခံထားတာဖြစ်တယ် တကယ် object ဆောက်ပေးတဲ့ function က component
@Configuration
public class Time24 implements TimeFormat {
	
	@Override
	public void showTime() {
		System.out.println("09:30:10");
	}

}
