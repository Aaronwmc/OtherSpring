package hs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("hs/Utest.xml");
		HelloSpring hs=(HelloSpring)context.getBean("helloSpring");
		String s=hs.getMessage();
		System.out.println(s);
	}
}
