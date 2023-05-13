package com.app;
// dans le package il y a une seul dossier

public class App {
    private static String lastname;
	private  static String  firstname;
    private static String  numeroSiret;
    private static Adress adress;
    private static Town town;
    private static Phone phone;
    private static Email email;
   
	public static void main(String[] args) throws Exception { // args :arguments
      adress = new Adress();
    
		for(int i = 0 ; i < args.length; i++){ // le methods recupere les arguments 
			
			if(args[i].equals("nom")){
				lastname = args[++i];
			}

			if(args[i].equals("prenom")){
				firstname = args[++i];
			}
            if(args[i].equals("siret")){
				numeroSiret = args[++i];
			}

            // pour faire adress et declaration
            if(args[i].equals("zipcode")){
				adress.setZipcode  (args[++i]);
			}
            if(args[i].equals("number")){
				adress.setNumber (args[++i]);
			}
            if(args[i].equals("street")){
				adress.setStreet(args[++i]);
			}
            if(args[i].equals("town")){
				town =new Town(args[++i]);
			}

            // pour faire le phone
            if(args[i].equals("phone")){
				phone =new Phone(args[++i]);
			}
            if(args[i].equals("email")){
				email =new Email(args[++i]);
			}


            
		}
        Personne1 client = new Personne1(lastname,firstname, numeroSiret);
       // Adress clientAdress= new Adress("67","Rue jacques decour","91700");
		//System.out.println(client.toString() );
        //System.out.println(adress.toString() );
        //System.out.println(town.toString());
        //System.out.println(phone.toString());
        //System.out.println(email.toString());
		Facturation facturation = new Facturation(client, adress, town, phone, email);
		System.out.println(facturation.toString());
       	
	}
}
