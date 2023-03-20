package Javaintroducao;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
	
    Scanner leia = new Scanner(System.in);
    
    
    int idade;
    int contn21 = 0;
    int contn50 = 0;
    
           System.out.println("\nIdade");
            idade = leia.nextInt();
     
            
          while(idade <= 21) {
        	  contn21++;
        	  
        	  if(idade >= 50) {
        		  contn50++;
        		  
        	  }else if(idade == 0) {
        		  break;
        	  } 
        	  System.out.println("A quantidade de pessoas com idade menor que 21 anos é igual a: " +contn21); 
        	  System.out.println("A quantidade de pessoas com idade mair que 50 anos é igual a: " +contn50);
          }
		
  }
	
}	