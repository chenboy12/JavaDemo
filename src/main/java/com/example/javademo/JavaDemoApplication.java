package com.example.javademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.core.Common;
import test.*;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicMarkableReference;

@SpringBootApplication
@RestController
public class JavaDemoApplication {

	public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

		Pairs<Integer> p =new Pairs<>(123);
		String str=Change(p);
		System.out.println(str);




		//		String Name="陈博";
//		Integer Age=18;
//		Boolean Istrue=Boolean.TRUE;
//		Pair<String> pair=new Pair(String.class);
//
//		System.out.println("str:"+pair.GetAnnotations());

//		Pair<String,Integer> One=new Pair<>("陈博",18);
//		Pair<Boolean,String> Two=new Pair<>(true,"陈博");
//		One.setName("陈博");
//		One.setAge(21);
//		One.setIsTrue(true);


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

	public static String Change(Pairs<? extends Number> pairs){
		Number ii=pairs.GetOne();
		return ii.toString();
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
