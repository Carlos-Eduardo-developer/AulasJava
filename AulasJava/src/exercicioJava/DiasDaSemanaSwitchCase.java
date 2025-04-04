package exercicioJava;

import java.util.Scanner;

public class DiasDaSemanaSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione um dia da semana:");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terça");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado");




		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(" Hoje é Domingo");
			break;
		case 2:
			System.out.println(" Hoje é Segunda");
			break;
		case 3:
			System.out.println(" Hoje é Terça");
			break;
		case 4:
			System.out.println(" Hoje é Quarta");
			break;
		case 5:	
			System.out.println(" Hoje é Quinta");
			break;
		case 6:	
			System.out.println(" Hoje é Sexta");
			break;
		case 7:	
			System.out.println(" Hoje é Sábado");
			break;
		default:
			System.out.println("Escolha inválida");
			break;
		}
		
		sc.close();
	}

}