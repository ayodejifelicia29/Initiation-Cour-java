package com.app;

public class Facturation {
	private Personne1 client;
	private Adress adress;
	private Town town;
	private Phone phone;
	private Email email;
	public Personne1 getClient() {
		return client;
	}
	public void setClient(Personne1 client) {
		this.client = client;
	}
	public Adress getAdress() {
		return adress;
	}
	public Facturation(Personne1 client, Adress adress, Town town, Phone phone, Email email) {
		this.client= client;
		this.adress = adress;
		this.town = town;
		this.phone = phone;
		this.email = email;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Town getTown() {
		return town;
	}
	public void setTown(Town town) {
		this.town = town;
	}
	public Phone getPhone() {
				return phone;
	}
			public void setPhone(Phone phone) {
				this.phone = phone;
			}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	
	public String toString(){
		return String.format(" %s %s %s %s %s", getClient(),getAdress(),getTown(),getPhone(),getEmail() );
	}
	
}