package Javaintroducao;

import java.util.Scanner;

public class Attif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner leia = new Scanner(System.in);
		 
		 int num;
		 
		 System.out.println("\nInforme um numero: ");
		 num = leia.nextInt();
		 
		 if(num % 2 == 0 && num >= 0) {
			 System.out.println("\nO numero é par e positivo. ");
			 
		 }else if(num % 2 == 0 && num < 0){
			 System.out.println("\nO numero é par e negativo. ");	 
			 
		 }else if(num % 2 != 0 && num >=0){
			 System.out.println("\nO numero é impar e positivo. ");
			 
			 //System.out.println("Informe ")
		 }
		 else if (num >= 0 && num <0){
			 System.out.println("O numero é impar e negativo");
			
		 }
			 
		
	}

}
