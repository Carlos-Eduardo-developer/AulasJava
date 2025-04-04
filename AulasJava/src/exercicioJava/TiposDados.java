package exercicioJava;

import java.util.Scanner;

public class TiposDados {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a variável correspondente: ");
		System.out.println("1- byte: ");
		System.out.println("2- short: ");
		System.out.println("3- int: ");
		System.out.println("4- long ");
		System.out.println("5- float ");
		System.out.println("6- double ");
		System.out.println("7- boolean ");
		System.out.println("8- char ");
		System.out.println("9- String ");
		
		int variavel = sc.nextInt();
		
		switch(variavel) {
		
		case 1:
			System.out.println("A variável byte armazena -128 até 127:");
		    break;
		case 2:    
			System.out.println("A variavel short armazena -32,768 até 32,767");
		    break;
		case 3:
		    System.out.println("A variável int armazena -2,147,483,648 até 2,147,483,647");
		    break;
		case 4:
			System.out.println("A variável long armazena -9,223,372,036,854,775,808 até 9,223,372,036,854,775,807");
			break;
		case 5:
			System.out.println("A variável float Armazena de 6 a 7 números fracionários");
			break;
		case 6:
			System.out.println("A variável double Armazena de 15 a 16 números fracionários");
			break;
		case 7:
			System.out.println("A variável boolean Armazena valores Verdadeiros ou Falsos");
			break;
		case 8:
			System.out.println("A variável char Armazena um único caractere/letra ou valores ASCII");
			break;
		case 9:
			System.out.println("A variável String armazena um conjunto de caracter, ou seja, um conjunto de char");
			break;
			default:
			System.out.println("Não existe variável correspondente: ");
			break;
			
		}
		
		sc.close();
	}
	
	

}
