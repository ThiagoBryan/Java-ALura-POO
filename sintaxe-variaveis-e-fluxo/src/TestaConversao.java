
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1250.70; 
		Integer valor = (int) salario; // o que esta entre () se chama CASTING, serve para forçar a conversão;
		System.out.println(valor);

		double valor1 = 0.2;
		double valor2 = 0.1;
		double valorTotal = valor1 + valor2;
		
		System.out.println(valorTotal);
		
		String saudacao = "Olá, meu nome é ";
		String nome = "Rômulo ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}

}
