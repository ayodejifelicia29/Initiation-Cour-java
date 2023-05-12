package com.app;

public class Adress {
	private String number; // [1,4000]
	private String street; // 2,50
	private String zipcode; // 5
	
	
	public Adress(String number, String street, String zipcode) throws Exception {

		if(number.length() > 1 && number.length()<4000){
			this.number = number;
		}else{
			throw new Exception("number n'est pas valide");
		}

		if (street.length() > 2 && street.length() < 50) {
			this.street = street ;	
		}else{
			throw new Exception("le street n'est pas valide");
		}
		
		if (zipcode.length()==5) {
			this.zipcode = zipcode;
		}else {
			throw new Exception("le zipcode n'est pas valide");
		}	
	}
	public Adress(){
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
        return String.format("%s %s %s", getNumber(), getStreet(),getZipcode());
    }
}
