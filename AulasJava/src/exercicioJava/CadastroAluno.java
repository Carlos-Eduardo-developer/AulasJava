package exercicioJava;

import java.util.Scanner;

public class CadastroAluno {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
    //Entrada de dados

	System.out.println("Digite o seu nome: ");
	String nome = sc.next();
	
	System.out.println("Digite o seu sobrenome: ");
	String sobrenome = sc.next();
	
	System.out.println("Digite a sua idade: ");
	int idade = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Digite o seu período de estudo: ");
	String periodo = sc.nextLine();
	
	System.out.println("Digite a turma que está matriculado: ");
	String turma = sc.nextLine();
	
	System.out.println("Digite o seu CPF: ");
	String cpf = sc.nextLine();
	
	System.out.println("Digite o seu logradouro: ");
	String logradouro = sc.nextLine();
	
	System.out.println("Digite o seu CEP: ");
	String cep = sc.nextLine();
	
	System.out.println("Digite o seu telefone sem DDD: ");
	String telefone = sc.nextLine();
	
	System.out.println("Digite o número do seu RG: ");
	String rg = sc.nextLine();
	
	// Saída de dados
	
	System.out.println("O nome do aluno(a) é: " + nome);
	System.out.println("O sobrenome do aluno(a) é: " + sobrenome);
	System.out.println("A idade do aluno(a) é: " + idade);
	System.out.println("O período de estudo é: " + periodo);
	System.out.println("A turma matriculada é: " + turma);
	System.out.println("O CPF do aluno(a) é: " + cpf);
	System.out.println("O logradouro do aluno(a) é: " + logradouro);
	System.out.println("O CEP do aluno(a) é: " + cep);
	System.out.println("O telefone do aluno(a) é: " + telefone);
	System.out.println("O RG do aluno(a) é: " + rg);
			
	sc.close();
   }
}