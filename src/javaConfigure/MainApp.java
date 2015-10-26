package javaConfigure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext ctx = 
      new AnnotationConfigApplicationContext(HelloWorldConfig.class);

      HelloWorldConfig hc = ctx.getBean(HelloWorldConfig.class);
      hc.helloWorld().checkSpelling();
      
   }
}