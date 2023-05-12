package com.app;

import java.nio.charset.MalformedInputException;

public class Personne1 {
	
    private String firstname; // [2 ; 32]
    private String lastname; // [2 ; 32]
    private Phone phone; // commence par 0; 10 chiffres
    private Email email; // [3;255], présence de @ 
    private Town town;  // alphabétique; [2 ; 32]
    private Adresse address; // [5 ; 5] 
    private String numeroSiret;// 14


	public Personne1(String firstname, String lastname) throws IllegalArgumentException {

		if(firstname.length() < 2) {
			throw new IllegalArgumentException("Firstname doit être composé d'au moins 2 caractères.");
		}
	
		if(lastname.length() < 2) {
			throw new IllegalArgumentException("Lastname doit être composé d'au moins 2 caractères.");
		}
		
		this.firstname = firstname;
		this.lastname = lastname;
	}
}



