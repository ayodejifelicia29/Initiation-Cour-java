package com.app;

public class Client {
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
