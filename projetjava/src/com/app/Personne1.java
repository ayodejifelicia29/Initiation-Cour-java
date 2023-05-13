package com.app;

import java.nio.charset.MalformedInputException;

public class Personne1 {
	
    private String firstname; // [2 ; 32]
    private String lastname; // [2 ; 32]
    private Phone phone; // commence par 0; 10 chiffres
    private Email email; // [3;255], présence de @ 
    private Town town;  // alphabétique; [2 ; 32]
    private Adress adress; // [5 ; 5] 
    private String numeroSiret;// 14


    public Personne1(String  lastname ,String firstname, String numeroSiret) throws IllegalArgumentException {

		if(lastname.length() < 2) {
			throw new IllegalArgumentException("Firstname doit être composé d'au moins 2 caractères.");
		}
	
		if(firstname.length() < 2) {
			throw new IllegalArgumentException("Lastname doit être composé d'au moins 2 caractères.");
		}
        if(numeroSiret.length() !=14) {
			throw new IllegalArgumentException("Lastname doit être composé d'au moins 2 caractères.");
		}
		
		
		this.lastname = lastname;
		this.firstname = firstname;
        this.numeroSiret =numeroSiret;
	}
	public String getLastName() {
        return lastname;
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public String getNumeroSiret(){
        return numeroSiret;
    }

    
    public String toString() {
        return String.format("%s %s %S" , getLastName(), getFirstName() ,getNumeroSiret());
    }

	
}



