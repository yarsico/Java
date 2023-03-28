package Collections;


import java.util.Iterator;
import java.util.Stack;

public class Atividades1 {

	public static void main(String[] args) {
		
		
Stack<String> pilha = new Stack<String>();
		
		
		pilha.push("Prato verde");
		pilha.push("Prato vermelho");
		pilha.push("Prato preto ");
		pilha.push("Prato preto");
		pilha.push("Prato preto");
		
		System.out.println("\nElementos da pilha"+pilha);
		System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
		System.out.println("\nElementos da pilha: "+pilha);
		System.out.println("\nElementos no topo da pilha: "+pilha.peek());
		System.out.println("\nAdicionar um elemento na pilha chamado Prato roxo: "+pilha.push("Prato roxo"));
		System.out.println("Elementos da pilha: "+pilha);
		System.out.println("\nTamanho da pilha: "+pilha.size());
		System.out.println("\nVerificar o elemento da pilha: "+pilha.contains("Prato azul"));
		System.out.println("\nexibir todos os elementos da minha pilha...");
		
		
		Iterator<String> iterator = pilha.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
