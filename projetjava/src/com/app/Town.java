package com.app;

public class Town {
	private String town;
	public Town(String town) throws Exception{
		if(town.length() ==2 && town.length()<32){
			this.town = town;
		}else{
			throw new Exception("le ville n'est pas correct");
		}
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
}
