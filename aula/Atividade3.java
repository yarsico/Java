package Javaintroducao;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String [] args){
		
		Scanner leia = new Scanner(System.in);	
    
   float sal_bruto, add_noturno, hora_extra, descontos, sal_liquido;
   
   System.out.println("Qual o valor do salário bruto? ");
   sal_bruto = leia.nextFloat();
   System.out.println("Infrome o valor do adicional noturno: ");
   add_noturno = leia.nextFloat();
   System.out.println("Informe o valor equivalente as horas extras: ");
   hora_extra = leia.nextFloat();
   System.out.println("Informe o valor do desconto mensal: ");
   descontos = leia.nextFloat();
   
   sal_liquido = sal_bruto + add_noturno + (hora_extra * 5) - descontos;
   
   System.out.println("O valor do seu salário liquido equivale a: "+sal_liquido);
   sal_liquido = leia.nextFloat();
   
   
		
   
		
		
		
	}

}
