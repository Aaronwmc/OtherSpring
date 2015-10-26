package insideBean;

import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import beanFactory.InitHelloSpring;

@SuppressWarnings("deprecation")
public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractBeanFactory factory = new XmlBeanFactory(new ClassPathResource("insideBean/insideBean.xml"));
		TextEditor edt=(TextEditor) factory.getBean("outerBean");
		edt.spellCheck();
	}
}
