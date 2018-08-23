package com.vladimir.pour;

public class SaisieN {
    //Class permettant la saisie du nombre entier et l'appliquer en valeur de eNbreSaisi
    
    private int eNbreSaisi;

  
    	public int geteNbreSaisi() {
    	    return eNbreSaisi;
    	}
    	
    	public void seteNbreSaisi(int eNbreSaisi) {
        this.eNbreSaisi = eNbreSaisi;
    	}
   
    	public SaisieN(int eNbreSaisi) {
    	    super();
    	    this.eNbreSaisi = eNbreSaisi;
    	}

      public String toString() {
	return "Vous avez saisi " + eNbreSaisi;
    }

 
    
   
}   
    