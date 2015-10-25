package pInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("pInheritance/inhert.xml");
		/*HelloSpringBasic basic=(HelloSpringBasic) context.getBean("HelloSpringBasic");
		basic.getMessage1();
		basic.getMessage2();*/
		
		HelloSpringA a=(HelloSpringA) context.getBean("HelloSpringA");
		a.getMessage1();
		a.getMessage2();
		a.getMessage3();
	}

}
