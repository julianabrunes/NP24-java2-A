package br.com.senaisp.bauru.juliana.secao05;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        JOptionPane.showConfirmDialog(null,
    			 "Quer participar?",
    			 "Quiz o quanto você conhece vídeogame",
    	          JOptionPane.YES_NO_OPTION,
    	          JOptionPane.QUESTION_MESSAGE);
    	 
    	 JOptionPane.showInputDialog(null,
    			 "Quanto tempo você joga por dia?",
    			 "Quiz o quanto você conhece vídeogame",
    			 JOptionPane.INFORMATION_MESSAGE,
    			 null,
    			 null,
    			 "Digite algo aqui.");   	 
    	 Integer.parseInt(
    			 (String) JOptionPane.showInputDialog(null,
		 "Qual sua idade?",
		 "Quiz o quanto você conhece vídeogame",
		 JOptionPane.INFORMATION_MESSAGE,
		 null,
		 null,
		 "Digite algo aqui."));

    	 	 
    	 
    	
        //Store the input as a String and print it.
        
        
        
        //Parse the input as an int.
        //Print its value +1
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
