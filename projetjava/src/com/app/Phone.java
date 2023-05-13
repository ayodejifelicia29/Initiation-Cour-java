package com.app;

public class Phone {
	
	private String phone;
	public Phone (String phone) throws Exception{
		if(phone.length() ==10 && phone.startsWith("0")){
			this.phone = phone;
		}else{
			throw new Exception("le numéro n'est pas valide");
		}
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
        return String.format(" %s",  getPhone());
    }
}
