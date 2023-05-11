package com.app;

import javax.swing.text.html.Option;

public class Personne {

    private String firstname; // [2 ; 32]
    private String lastname; // [2 ; 32]
    private int age; // [0 ; 120]
    private String phone; // commence par 0; 10 chiffres
    private String email; // [3;255], présence de @ 
    private String town;  // alphabétique; [2 ; 32]
    private String zipcode; // [5 ; 5]
    private short numero; // [1 ; 8182] 
    private String option; // {bis, ter}
    private String street_name; // [2 ; 64]
    
    
    public Personne(String firstname, String lastname) throws IllegalArgumentException {

        if(firstname.length() < 2) {
            throw new IllegalArgumentException("Firstname doit être composé d'au moins 2 caractères.");
        }

        if(lastname.length() < 2) {
            throw new IllegalArgumentException("Lastname doit être composé d'au moins 2 caractères.");
        }
        
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }
    
    public String getFirstName() {
        return firstname;
    }

    public String toString() {
        return String.format("%s %s", getLastName(), getFirstName());
    }

	public Personne(String phone, String email,String town, String zipcode, String option, String street_name, int age ,short numero){
		this.phone=phone;
		this.email = email;
		this.town = town;
		this.zipcode =zipcode;
		this.option =option;
		this.street_name = street_name;
		this.age =age;
		this.numero = numero;
	}
	public String getPhone(){
		return phone;
	}
	public String getemail(){
		return email;
	}
	public String gettown(){
		return town;
	}
	public String getzipcode(){
		return zipcode;
	}
	public String getoption(){
		return option;
	}
	public String getstreet_name(){
		return street_name;
	}
	public int getage(){
		return age ;
	}
	public short getnumero(){
		return numero;
	}
	public String toStringall() {
        return String.format("%s %s %s %s %s %s %s %o %x",  getPhone(), getemail(),gettown(),getzipcode(),getoption(), getstreet_name(),getstreet_name(),getage(),getnumero());
    }
}
