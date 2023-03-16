package Javaintroducao;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String []args) {
		
		
		Scanner leia = new Scanner(System.in);	
		
		float n1, n2, n3, n4, resultado;
		
		System.out.println("Informe um numero: ");
		n1 = leia.nextFloat();
		System.out.println("Informe outro numero");
		n2 = leia.nextFloat();
		System.out.println("Informe outro numero: ");
		n3 = leia.nextFloat();
		System.out.println("Por fim,digite mais um numero: ");
		n4 = leia.nextFloat();
		
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.println("Resultado: " +resultado);
		
		
		 
		
	}
}
