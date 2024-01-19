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
	
//	TimeFormat time24 = new Time24();
//	TimeFormat time12 = new Time12();
	
//	@Autowired အကြောင်းစမယ်
//	Spring မှာ java တုန်းကလို object ဆောက်ရင် အပေါ်ကအတိုင်းမရေးတော့ပဲ "@Autowired" နဲ့ရေးတယ် အရေးကြီးတယ် အောက်နဲ့အပေါ်နဲ့ရေးထားတာက အတူတူပဲ
//	@Autowired အသေးစိတ်စမယ် သူ့ကို Dependency Injection တွေလုပ်ရင်သုံးတယ်
//	သူ့ကို class field, method, constructor, parameter(), annotation => level တွေအားလုံးမှာထည့်သုံးလို့ရတယ်
//	သူက DemoApplication ထဲက context ထဲမှာရှိပြီးသား object ဆောက်ချင်တဲ့ class တွေကို တကယ်လှမ်းချိတ်ဆက်ပြီးတော့ object ဆောက်ပေးတယ်
//	အဓိကက Dependency Injection လုပ်ပေးတယ် သို့သော် object တစ်ခုထဲပဲရမယ် နှစ်ခုသုံးခုဖြစ်လာရင် "@Qualifier" ကိုထပ်သုံးရတယ်
//	@Qualifier ကတော့ @Autowired ထဲရှိ objects တွေထဲက ကိုယ်ချိတ်ချင်တဲ့အသေးစိတ် object ကို ချိတ်ဆက်နိုင်တယ် 
	
	int num;
	
	@Autowired
	@Qualifier("time12")
	TimeFormat time;
	
	@Autowired
	@Qualifier("time24")
	TimeFormat time2;
	
//	@Autowired
//	ဒါက constructor level မှာ @Autowired ကိုသုံးထားတာ constructor ကနေ object ဆောက်လိုက်လို့
//	ထည့်လိုက်တဲ့ input နဲ့ ကိုက်တဲ့ context ထဲက class ကို @Autowired က object ဆောက်ပေးသွားမယ်
//	public TimeService(TimeFormat time) {
//		this.time = time;
//	}
	
//	@Autowired အကြောင်းပြီးရင် အပေါ်ဆုံးက @Scope ကိုသွားကြည့်
	
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
