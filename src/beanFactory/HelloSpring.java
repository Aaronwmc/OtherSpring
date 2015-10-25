package beanFactory;

public class HelloSpring {

	public HelloSpring() {
		// TODO Auto-generated constructor stub
	}

	private String message;

	public void setMessage(String message){
		  this.message  = message;
	}

	public void getMessage(){
		  System.out.println("Your Message : " + message);
	}
}
