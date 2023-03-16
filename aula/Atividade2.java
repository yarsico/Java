package Javaintroducao;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String [] args) {
		float nota1, nota2, nota3, media; 
		
	    Scanner leia = new Scanner(System.in);

	    
	   System.out.println("Informe a sua primeira nota: ");
	   nota1 = leia.nextFloat();
	   System.out.println("Informe a sua segunda nota: ");
	   nota2 = leia.nextFloat();
	   System.out.println("Informe a sua terceira nota: ");
	   nota3 = leia.nextFloat();
	   
	   media = (nota1 + nota2 + nota3)/3;
			   
	   System.out.println("A sua media é igaul a: " +media);
	   media = leia.nextFloat();
	   
 	  
	}
	
}
