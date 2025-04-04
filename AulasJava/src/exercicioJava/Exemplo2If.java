package exercicioJava;

import java.util.Scanner;

public class Exemplo2If {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = sc.nextInt();
		
		if (idade <17) {
			System.out.println("Não pode dirigir");
		}
		
		sc.close();
	}
}
