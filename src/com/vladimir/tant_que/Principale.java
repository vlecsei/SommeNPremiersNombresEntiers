package com.vladimir.tant_que;

import javax.swing.JOptionPane;

public class Principale {
    
    static SaisieN nbreN = new SaisieN(0);
    static int i;
    static int somme;
    
    
    public static void main(String[] args) {
	
	
	    
	    nbreN.seteNbreSaisi(Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre entier à saisir", "Nombre entier", JOptionPane.QUESTION_MESSAGE)));
	
	
	    JOptionPane.showMessageDialog(null, nbreN.toString());
	    
	    while (i <= nbreN.geteNbreSaisi()) {
		somme = somme + i;
		i++;
	    }JOptionPane.showMessageDialog(null, "La somme des entiers de 0 à "+nbreN.geteNbreSaisi()+" est de "+somme);
	
	
	
    }

}
