package Coleção;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
	 
		 Scanner leia = new Scanner(System.in);

		
		
		Queue<String> lista = new LinkedList<String>();
		int opções;
		
		
		
		while(true) {
		System.out.println("0-------Sair--------");
		System.out.println("1-------Chamar uma pessoa para a lista-----------");
		System.out.println("2-------Remova alguem da lista-----------");
		System.out.println("3-------Mostre a lista.-----------------");
		
		System.out.println("\nInforme a opção desejada: ");
		opções = leia.nextInt();
		
		if(opções == 0) {
			System.out.println("\nVocê saiu da lista de espera.");
		}
		switch (opções) {
		case 1:
			System.out.println("\nInforme o nome do cliente: ");
			leia.nextLine();
			String nome = leia.nextLine();
			lista.add(nome);
			break; 
			
		case 2: 
			if(lista.isEmpty()) {
			System.out.println("\nA fila está vazia");
			}else {
				System.out.println("\nCliente " +lista.peek()+ " va  direto ao caixa.");
				lista.remove();
			}
		case 3: 
			System.out.println("\nMostre a lista.."+lista);
			break;
			
	
			
			
			
			
			
		
		
		
		}
		
		
	} 
		
 }
	
}
	
	
	

