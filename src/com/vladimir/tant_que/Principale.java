package com.vladimir.tant_que;

import javax.swing.JOptionPane;

public class Principale {
    
    static SaisieN nbreN = new SaisieN(0);
    static int i;
    static int somme;
    
    
    public static void main(String[] args) {
	
	
	    // Pour ma variable nbreN je demande � l'utilisateur de me rentrer une valeur que j'attibue � la variable eNbreSaisi de ma class SaisieN
	
	
	    nbreN.seteNbreSaisi(Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre entier � saisir", "Nombre entier", JOptionPane.QUESTION_MESSAGE)));
	
	
	    JOptionPane.showMessageDialog(null, nbreN.toString());
	    
	    while (i <= nbreN.geteNbreSaisi()) {
		somme = somme + i;
		i++;
	    }JOptionPane.showMessageDialog(null, "Le r�sultat avec while() {...} est : "+somme, "R�sultat avec tant que", JOptionPane.INFORMATION_MESSAGE);
	
	
	
    }

}
