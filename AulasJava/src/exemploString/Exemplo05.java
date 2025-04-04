package exemploString;

public class Exemplo05 {

	public static void main(String[] args) {
		String nome = "Carlos";
		String nomeDoMeio = "Eduardo";
		String sobrenome = "Moreira";
		
		System.out.println("O Nome Completo é : "+ nome.concat(" ").concat(nomeDoMeio).concat(" ").concat(sobrenome));
	}

}