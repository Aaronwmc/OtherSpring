package beanFactory;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class MainApp {
   public static void main(String[] args) {
	   ConfigurableListableBeanFactory factory = new XmlBeanFactory
                             (new ClassPathResource("Beans.xml"));
	  factory.addBeanPostProcessor(new InitHelloSpring());
      HelloSpring obj = (HelloSpring) factory.getBean("helloWorld");
      obj.getMessage();
   }
}