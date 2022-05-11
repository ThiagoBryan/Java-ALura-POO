
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando Escopo");
		Integer idade = 18;
		Integer quantidadePessoas = 2;
		//boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado; // Tem que declarar antes;
		if(quantidadePessoas >=2) {
			 acompanhado = true;
		}else {
			 acompanhado = false;
		}

		
		System.out.println("Valor acompanhado: " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem-vindo!");
		} else {
			System.out.println("Você não pode entrar.");
		}
	}

}
