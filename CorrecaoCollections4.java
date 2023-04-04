package Coleção;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class CorrecaoCollections4 {

	public static void main(String[] args) {
	
			
				
				Scanner leia = new Scanner(System.in);
				
				Set<Integer> numeros = new HashSet<Integer>();
				
				boolean veri; 
				
				numeros.add(10);
				numeros.add(9);
				numeros.add(8);
				numeros.add(7);
				numeros.add(6);
				numeros.add(1);
				numeros.add(2);
				numeros.add(3);
				numeros.add(4);
				numeros.add(5);
			
				System.out.println("\nDigite o número que você deseja encontrar: ");
				int n = leia.nextInt();
				
				
				veri = numeros.contains(n);
				
				if(veri == true) {
					System.out.printf("\nO número %d foi encontrado!!!",n);
				}else {
					
					System.out.println("\nO número "+n+" não foi encontrado!!!");
				}

			}



	}


