package test;

import net.wmc.spring.qs.Action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SimpleTest {

	public SimpleTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void testQuickStart() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		//FileSystemXmlApplicationContext("bean.xml");
		Action action = (Action) ctx.getBean("TheAction");
		System.out.println(action.execute("Rod Johnson"));
		Action action1 = (Action) ctx.getBean("hello");
		System.out.println(action1.execute("Allen"));
		Action action2 = (Action) ctx.getBean("bye");
		System.out.println(action2.execute());
	}
}
