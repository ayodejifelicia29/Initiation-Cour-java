package com.app;

public class Personne {
	private String firstame; // [2; 32]
	private String lastname; // [2 ;32]
	private int age; // [0; 120] 
	private String phone; // commence par 0; 10 chiffres
	private String Email; // [3 ; 255], présence de @
	private String town; // alphabétique ; au moins 2 caractéres
	private String zipcode; // [5;5]
	private short numero; // [1 ; 8182]
	private String option; // [bis ; ter]
	private String street; // [2, 64]

	

	
	public Personne(String firstname, String lastname) throws IllegalArgumentException{

		if(firstname.length() < 2  ){
			throw new IllegalArgumentException("Firstname doit être composé d'au moins 2 caractéres.");   
		}
		if(lastname.length() <2){
			throw new IllegalArgumentException("Lastname doit être composé d'au moins 2 caractéres."); 
		}

		this.firstame =firstname;
		this.lastname =lastname;
	}
	public String getLastName(){
	  return lastname;
	}
	public String getFirstName(){
		return firstame;
	}
	public String toString(){
		return String.format("%S % S", getLastName(), getFirstName());
	}

}
