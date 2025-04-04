package exercicioJava;

import java.util.Scanner;

public class DiasdaSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero correspondente ao dia da semana: ");
		
		int diadasemana = sc.nextInt();
		
		if(diadasemana == 1) {
			System.out.println("Domingo");
		}else if (diadasemana == 2) {
			System.out.println("Segunda");
		}else if (diadasemana == 3) {
			System.out.println("Terça");
		}else if (diadasemana == 4) {
			System.out.println("Quarta");
		}else if (diadasemana == 5) {
			System.out.println("Quinta");
		}else if (diadasemana == 6) {
			System.out.println("Sexta");
		}else if (diadasemana == 7) {
			System.out.println("Sabado");
		}else {
			System.out.println("nao corresponde o dia da semana");
		}
		
		sc.close();

	}

}