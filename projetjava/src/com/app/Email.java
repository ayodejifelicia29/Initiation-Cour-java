package com.app;

public class Email {
	private String email;
	public Email(String email) throws Exception{
		if(email.contains("@")  && email.length()> 6){
			this.email = email;
		}else{
			throw new Exception("l'email n'est pas valide");
		}
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
