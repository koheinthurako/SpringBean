package com.ioc.Demo.com.ioc.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration("service")
@Scope(value = "singleton")
// @Scope က အလုပ်လုပ်နိုင်တဲ့ ပမာဏကိုသတ်မှတ်ပေးတဲ့သဘာ singleton လို့ထည့်ရင် ဒီ class တစ်ခုလုံးကို object ဘယ်နှစ်ခုပဲဆောက်ဆောက် Address တစ်ခုကိုပဲညွှန်းတယ်
// object တွေထဲက ဘယ် object ကတန်ဖိုးပြောင်းပြောင်း တခြား object တွေပါလိုက်ပြောင်းတယ်

//@Scope(value = "prototype")
// "prototype ကတော့ class တစ်ခုလုံးကို object ဆောက်ရင်ဆောက်သလို သီးခြား Address တွေနဲ့ပဲ အလုပ်လုပ်တယ်
public class TimeService {
	
//	TimeFormat time = new Time();
	
//	Spring မှာ java တုန်းကလိုမရေးတော့ပဲ "@Autowired" နဲ့ရေးတယ် အရေးကြီးတယ် အောက်နဲ့အပေါ်နဲ့ရေးထားတာက အတူတူပဲ
//	@Autowired အသေးစိတ်စမယ် သူ့ကို Dependency Injection တွေလုပ်ရင်သုံးတယ်
//	သူ့ကို class ထဲက field, method, constructor, parameter() => level တွေအားလုံးမှာထည့်သုံးလို့ရတယ် 
//	အဓိကက Dependency Injection လုပ်ပေးတယ် သို့သော် object တစ်ခုထဲပဲရမယ် နှစ်ခုသုံးခုဖြစ်လာရင် "@Qualifier" ကိုထပ်သုံးရတယ်
//	@Qualifier ကတော့ @Autowired ထဲရှိ objects တွေထဲက ကိုယ်ချိတ်ချင်တဲ့အသေးစိတ် object ကို ချိတ်ဆက်နိုင်တယ် 
	
	int num;
	
	@Autowired
	@Qualifier("time12")
	TimeFormat time;
	
	@Autowired
	@Qualifier("time24")
	TimeFormat time2;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void  show() {
		time.showTime();
		time2.showTime();
	}

	@Override
	public String toString() {
		return "TimeService [num=" + num + "]";
	}
	
}
