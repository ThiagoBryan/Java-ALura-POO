
public class TestaCondicional2 {
	public static void main(String[] args) {

		// &&    ||   boolean = true ou false 
		
		System.out.println("Testando Condicionais");
		Integer idade = 18;
		Integer quantidadePessoas = 2;
		boolean acompanhado = true; // KEYWORD
		
		
		if (idade >= 18 && quantidadePessoas >= 2 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Você não pode entrar.");
		}
	}
}
