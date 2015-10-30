package net.wmc.spring.qs;

public class HelloAction implements Action{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String message) {
		this.name = message;
	}

	@Override
	public String execute(String name) {
		// TODO Auto-generated method stub
		return "hello "+name;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "hello "+getName();
	}
	

}
