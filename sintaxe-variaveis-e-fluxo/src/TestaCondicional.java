
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais");
		Integer idade = 15;
		Integer quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Maior que 18 anos.");
			System.out.println("Seja bem-vindo!");
		} else if(quantidadePessoas >= 2) {
			System.out.println("Menor de 18 anos, pois está acompanhado");
			System.out.println("Seja bem-vindo!");
		}else {
			System.out.println("Menor de 18 ano e não está acompanhado.");
			System.out.println("Você não pode entrar."); 			
		}
	}
}
