package com.app;
// dans le package il y a une seul dossier

public class App {
    private static String lastname;
	private  static String  firstname;
    private static Adress adress;
	public static void main(String[] args) throws Exception { // args :arguments
      adress = new Adress();
		for(int i = 0 ; i < args.length; i++){ // le methods recupere les arguments 
			
			if(args[i].equals("nom")){
				lastname = args[++i];
			}
			if(args[i].equals("prenom")){
				firstname = args[++i];
			}
            
            if(args[i].equals("zipcode")){
				adress.setZipcode  (args[++i]);
			}
            if(args[i].equals("number")){
				adress.setNumber (args[++i]);
			}
            if(args[i].equals("street")){
				adress.setStreet(args[++i]);
			}
            
		}
        Personne1 client = new Personne1(lastname,firstname);
       // Adress clientAdress= new Adress("67","Rue jacques decour","91700");
		System.out.println(client.toString() );
        System.out.println(adress.toString() );

		
	}
}
