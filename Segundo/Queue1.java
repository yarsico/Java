package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		
		
		
		Queue<Integer> fila = new LinkedList<Integer>();
		for(int i =0;i<10;i++) {
		    fila.add(i);
		}
         System.out.println("\nElementos da fila: "+fila);
         System.out.println("\nRemovendo um elemento da fila: "+fila.remove());
         System.out.println("\nElementos da fila apos a remoção: "+fila);
         System.out.println("\nAdicionando um elemento na fila: "+fila.add(null));
         System.out.println("\nElementos da fila: "+fila);
         System.out.println("\nPegar o primeiro elemento da fila: "+fila.peek());
         System.out.println("\nPegar o tamanho da fila: "+fila.size());
         System.out.println("\nVerificar um elemento na fila: "+fila.contains(37));
         System.out.println("\nExibir e vou também retirar o primeiro elemento da fila: "+fila.poll());
         System.out.println("\nElementos da fila: "+fila);
         
         Iterator<Integer> iterator = fila.iterator();
         
         while(iterator.hasNext()) {
        	 System.out.println(iterator.next());
          }
         System.out.println("\nLimpar a fila: ");
         fila.clear();
         System.out.println("\nverificar se a fila esta limpa(vazia)"+fila.isEmpty());
         System.out.println("\nElementos da fila: "+fila);

	}

}
