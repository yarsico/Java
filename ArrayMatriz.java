package Coleção;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayMatriz {
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        listaNumeros.add(6);
        listaNumeros.add(5);
        listaNumeros.add(4);
        listaNumeros.add(3);
        listaNumeros.add(2);
        listaNumeros.add(1);
        listaNumeros.add(10);
        listaNumeros.add(9);
        listaNumeros.add(7);
        listaNumeros.add(8);

       
        Scanner leia = new Scanner(System.in);
        System.out.println("\nDigite um número: ");
        int numero = leia.nextInt();

       
        int posicao = listaNumeros.indexOf(numero);
        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição " + posicao + " da lista.");
        } else {
            System.out.println("O número " + numero + " não foi encontrado na lista.");
        }
    }
}

