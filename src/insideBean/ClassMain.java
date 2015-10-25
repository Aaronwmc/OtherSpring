package insideBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("insideBean/insideBean.xml");
		TextEditor edt=(TextEditor) context.getBean("outerBean");
		//edt.spellCheck();
	}
}
