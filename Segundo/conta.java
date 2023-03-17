package Javaintroducao;

import java.util.Scanner;

public class conta {
public static void main(String[] args) {
        
	 Scanner leia = new Scanner(System.in);
	 
        float saldo = 1000;
        int opcao;
        float valor;
        
     
        
        
            System.out.println("Informe qual opção deseja exibir na tela:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Fazer um depósito");
            System.out.println("3 - Realizar saque");
            
            opcao = leia.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nSeu saldo é: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("\nDigite quanto você deseja depositar:");
                    valor = leia.nextFloat();
                    saldo = valor + saldo;
                    System.out.println("\nSeu novo saldo é: R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Digite quanto você gostaria de  sacar:");
                    valor = leia.nextFloat();
                    saldo = saldo - valor;
                    if( saldo >= valor) {   
                    System.out.println("Saque efetuado. Seu saldo atual equivale a: R$ " + saldo);
                   }
                    else {
                    	System.out.println("Você não possui saldo suficiente para realizar essa opção.");		
                    }
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            
            
           
                  }
}
}
        



