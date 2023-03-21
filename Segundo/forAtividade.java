
package Javaintroducao;

import java.util.Scanner;

public class forAtividade {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner(System.in);
		  
		  int numero[] = new int [10];
		  int x, cont;
		  
		  
		  for(x=0;x<10;x++) {
			  System.out.println("\nInforme o primeiro numero: ");
			  numero[x] = leia.nextInt();
		       }
				  
		  System.out.println("\nQual numero você gostaria de encontrar a posição? ");
		  cont = leia.nextInt();
		  
		  
		  for(x=0;x<10;x++) {
			  if(cont == numero[x]) {
				  System.out.println("\nEsta localizado" +cont+" na posição: "+(x+1));
			  }
			  
	}
		    
     
     
    		 
	}

}
