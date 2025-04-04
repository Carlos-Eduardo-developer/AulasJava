package exercicioJava;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero correspondente ao Mês: ");
		
		int diadasemana = sc.nextInt();
		
		if(diadasemana == 1) {
			System.out.println("Janeiro");
		}else if (diadasemana == 2) {
			System.out.println("Fevereiro");
		}else if (diadasemana == 3) {
			System.out.println("Março");
		}else if (diadasemana == 4) {
			System.out.println("Abril");
		}else if (diadasemana == 5) {
			System.out.println("Maio");
		}else if (diadasemana == 6) {
			System.out.println("Junho");
		}else if (diadasemana == 7) {
			System.out.println("Julho");
		}else if (diadasemana == 8) {
			System.out.println("Agosto");
		}else if (diadasemana == 9) {
			System.out.println("Setembro");
		}else if (diadasemana == 10) {
			System.out.println("Outubro");
		}else if (diadasemana == 11) {
			System.out.println("Novembro");
		}else if (diadasemana == 12) {
			System.out.println("Dezembro");
		
		}else {
			System.out.println("nao corresponde ao Mês");
		}
		
		sc.close();

	}

}