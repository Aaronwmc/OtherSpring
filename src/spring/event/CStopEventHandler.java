package spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler 
   extends ApplicationEvent{

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public CStopEventHandler(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

public void onApplicationEvent(ContextStoppedEvent event) {
      System.out.println("ContextStoppedEvent Received");
   }
}