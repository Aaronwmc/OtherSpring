package net.wmc.spring.qs;

public class ByeAction implements Action{

	private String name;

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	@Override
	public String execute(String name) {
		// TODO Auto-generated method stub
		return "goodbye "+name;
	}

	@Override
	public String execute() {
		// TODO Auto-generated method stub
		return "goodbye "+getname();
	}

}
