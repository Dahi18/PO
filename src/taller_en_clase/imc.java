package taller_en_clase;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class imc {
	
	public static void main (String[] args) {
	  Scanner entrada=new Scanner(System.in);
	  
	     String peso,estatura;
	     double kg,m,imc;
	     
		
		peso= JOptionPane.showInputDialog("¿Cual es tu peso?");
		estatura= JOptionPane.showInputDialog("¿Cual es tu estatura?");
		
		kg=Integer.parseInt(peso);
		m=Integer.parseInt(estatura);
		
		imc=kg/(m*m);
		 
		
		
		JOptionPane.showMessageDialog(null, "El imc es:"+imc);
		 if (imc<18.5) {
				JOptionPane.showMessageDialog(null," TIENES BAJO PESO" );
	        } else if (imc>=18.5 && imc<=24.9) {
	        	JOptionPane.showMessageDialog(null," ESTAS NORMAL" );
	        } else if (imc>=25 && imc<=29.9) {
	        	JOptionPane.showMessageDialog(null," TIENES SOBREPESO" );
	        } else {
	        	JOptionPane.showMessageDialog(null," TIENES OBESIDAD, DEBES DE CUIDARTE" );
	        }
		 
	}

}