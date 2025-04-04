package exercicioJava;

import java.util.Scanner;

public class MesesDoAnoSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Selecione um Mês do Ano:");
		System.out.println(" 1 - Janeiro");
		System.out.println(" 2 - Fevereiro");
		System.out.println(" 3 - Março");
		System.out.println(" 4 - Abril");
		System.out.println(" 5 - Maio");
		System.out.println(" 6 - Junho");
		System.out.println(" 7 - Julho");
		System.out.println(" 8 - Agosto");
		System.out.println(" 9 - Setembro");
		System.out.println("10 - Outubro");
		System.out.println("11 - Novembro");
		System.out.println("12 - Dezembro");
		




		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(" Mês de Janeiro");
			break;
		case 2:
			System.out.println(" Mês de Fevereiro");
			break;
		case 3:
			System.out.println(" Mês de Março");
			break;
		case 4:
			System.out.println(" Mês de Abril");
			break;
		case 5:	
			System.out.println(" Mês de Maio");
			break;
		case 6:	
			System.out.println(" Mês de Junho");
			break;
		case 7:	
			System.out.println(" Mês de Julho");
			break;
		case 8:	
			System.out.println(" Mês de Agosto");
			break;	
		case 9:	
			System.out.println(" Mês de Setembro");
			break;	
		case 10:	
			System.out.println(" Mês de Outubro");
			break;	
		case 11:	
			System.out.println(" Mês de Novembro");
			break;	
		case 12:	
			System.out.println(" Mês de Dezembro");
			break;
			default:
			System.out.println("Escolha inválida");
			break;
		}
		
		sc.close();
	}

}