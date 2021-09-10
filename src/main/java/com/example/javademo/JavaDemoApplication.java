package com.example.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.core.Common;
import test.*;

@SpringBootApplication
@RestController
public class JavaDemoApplication {

	public static void main(String[] args) {
		Pair<String,Integer,Boolean> One=new Pair<>(String.class,Integer.class,Boolean.class);
		One.setName("陈博");
		One.setAge(21);
		One.setIsTrue(true);
		System.out.println("姓名："+One.getName()+" 年龄："+One.getAge()+" 性别："+(One.getIsTrue()==true?"男":"女"));


//		ReflectionClass reflectionClass=new ReflectionClass();
//		String str="";
//		reflectionClass.ReflectionFun(String.class);
//		reflectionClass.ReflectionFun(str.getClass());
//		reflectionClass.ReflectionFun(Integer.class);
		//LogClass logclass=new LogClass();
		//logclass.LogFun();
		//TestClass tc=new TestClass();
		//tc.MainTest();
		//EnumClass test=EnumClass.XRGJ;
		//System.out.println(test.toString()+"-"+test.name()+"-"+test._type);
		SpringApplication.run(JavaDemoApplication.class, args);
	}

	@RequestMapping("hello")
	public static String GetHello(){
		return "Hello World!";
	}
	@RequestMapping("toString")
	public static String ToString(@RequestParam(value = "str",defaultValue = "请输入参数-字符串") String str){
		Common com=new Common(str);
		return com.toString();
	}

}
