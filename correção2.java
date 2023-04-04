package Coleção;

import java.util.ArrayList;
import java.util.Scanner;

public class correção2 {

	public static void main(String[] args) {
		 

		 Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);    
		
		//lendo um numero
		
		System.out.println("\nDigite o numero que você deseja encontrar");
		int n = leia.nextInt();
		
		
		//verificando a posição
		
		int posicao = numeros.indexOf(n);
		
		
		if(posicao != -1) {
			
			System.out.println("\nO numero"+n+"esta localizado na posição"+posicao);
			
			
		}else {
			System.out.println("\nO numero"+n+" não foi encontrado");
		}
	}
	

}
