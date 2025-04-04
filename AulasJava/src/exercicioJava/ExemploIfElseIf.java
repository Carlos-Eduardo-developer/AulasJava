package exercicioJava;

import java.util.Scanner;

public class ExemploIfElseIf {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade <16) {
			System.out.println("Não pode votar");
		} 
		 
	else if (idade<=17) {
			System.out.println("Pode votar");			
	    }
		
	else {
		System.out.println("Obrigatório votar");
	}
				
		sc.close();
	}
	

}
