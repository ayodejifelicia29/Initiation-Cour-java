package com.app;
// dans le package il y a une seul dossier

public class App {
    private static String nom;
	private  static String prenom;
	public static void main(String[] args) { // args :arguments
		for(int i = 0 ; i < args.length; i++){ // le methods recupere les arguments 
			System.out.println(args[i]);
			if(args[i].equals("--nom")){
				nom = args[++i];
			}
			if(args[i].equals("--prenom")){
				prenom = args[++i];

			}
		}
		System.out.println("Mr " + nom + " " + prenom );
		
	}
}
