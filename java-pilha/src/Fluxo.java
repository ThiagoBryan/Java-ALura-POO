public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try { // try pega a a linha do erro
			metodo1(); // ex = definir uma variavel
		} catch (ArithmeticException | NullPointerException | MinhaException ex) { // catch = pega o erro do console
			String mensagem = ex.getMessage(); // getMessage pega a mensagem do erro e mostra na tela
			System.out.println("Exception " + mensagem);
			ex.printStackTrace(); // printStackTrace = mostra onde esta o erro
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaException{
		System.out.println("Ini do metodo2");
		
		throw new MinhaException("deu ruim");
		
		//System.out.println("Fim do metodo2");

	}
}
