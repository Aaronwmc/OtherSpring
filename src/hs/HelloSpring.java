package hs;

public class HelloSpring {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("spring bean init");
	}
	
	public void destroy(){
		System.out.println("spring bean will destroy now");
	}

}
