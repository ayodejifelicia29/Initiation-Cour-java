package com.app;

public class Client {
	public static void main(String[] args) {
		try {
			Personne Felicia = new Personne("felicia","Ayodeji");
		   
			System.out.println( Felicia );
		}
		catch(IllegalArgumentException e) {// e qui conteint error
			System.out.println(e.getMessage());
		}
		finally { // finally s'executes 
			System.out.println("ok");
		}
	}
	
}

