package insideBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("insideBean/insideBean.xml");
		TextEditor edt=(TextEditor) factory.getBean("outerBean");
		edt.spellCheck();
	}
}
