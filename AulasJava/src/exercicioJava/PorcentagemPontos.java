package exercicioJava;

public class PorcentagemPontos {

	public static void main(String[]args) {
		
		// Defina a pontuação máxima possível no jogo para 500
		int PontuacaoMaxima = 500;

		// A pontuação real do usuário
		int PontuacaoAtual = 423;

		/* Calcule a porcentagem da pontuação do usuário em relação à pontuação máxima disponível.
		Converta a porcentagem para float para garantir que a divisão seja precisa */
		float porcentagem = (float) PontuacaoAtual / PontuacaoMaxima * 100.0f;

		System.out.println("A porcentagem do usuário é " + porcentagem);}
}
