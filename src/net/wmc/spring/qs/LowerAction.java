package net.wmc.spring.qs;

public class LowerAction implements Action {
private String message;
public String getMessage() {
return message;
}
public void setMessage(String string) {
message = string;
}
public String execute(String str) {
return (getMessage()+str).toLowerCase();
}
@Override
public String execute() {
	// TODO Auto-generated method stub
	return getMessage();
}
}