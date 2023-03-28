package Coleção;

import java.util.Iterator;
import java.util.Scanner;

public class Stack<T> {

	private boolean isEmpty;

	public static void main(String[] args) { 
		
		Scanner leia = new Scanner(System.in); 
		
		Stack<String> pilha = new Stack<String>();
		int opções = 0;
		
		
		
		while(true) {
		System.out.println("0:----------Sair---------------------------------");
		System.out.println("1:----------Adicionar um novo livro na pilha-----");
		System.out.println("2:----------Listar todos os livros da Pilha------");
		System.out.println("3: ---------Retirar um livro da pilha------------");
 
		System.out.println("Digite a opção desejado: ");
		
		if(opções == 0) {
			System.out.println("Você saiu da sua biblioteca");
		}
		switch(opções) {
		case 1:
			System.out.println("\nDigite qual livro gostaria de adicionar na sua biblioteca: "+pilha.pus(""));
			leia.nextLine();
			String livrol = leia.nextLine();
		    pilha.add(livrol);
			
			
		case 2:
			System.out.println("\nMostre todos os livros da pilha"+pilha);
			break;
			
		case 3:
			if(pilha.isEmpty) {
				System.out.println("\nA lista de livros está vazia. ");
			}else {
		    
			}
			
			
		
		}
	}

}

	private String pus(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(String livrol) {
		// TODO Auto-generated method stub
		
	}

}	


	

