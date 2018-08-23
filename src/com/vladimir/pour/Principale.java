package com.vladimir.pour;

import javax.swing.JOptionPane;

import com.vladimir.tant_que.SaisieN;

public class Principale {
    
    static SaisieN nbreN = new SaisieN(0);
    static int i = 0;
    static int somme;
    
    
    public static void main(String[] args) {
	
	
	    
	    nbreN.seteNbreSaisi(Integer.parseInt(JOptionPane.showInputDialog(null, "Nombre entier à saisir", "Nombre entier", JOptionPane.QUESTION_MESSAGE)));
	
	
	    JOptionPane.showMessageDialog(null, nbreN.toString());
	    
	   for (i = 0; i <= nbreN.geteNbreSaisi(); i++) {
		somme = somme + i;
	    }
	    
	    JOptionPane.showMessageDialog(null, "Le résultat avec for() {...} est : "+somme, "Résultat avec pour", JOptionPane.INFORMATION_MESSAGE);
		
	
	
    }

}
