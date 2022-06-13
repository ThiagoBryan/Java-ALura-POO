package bytebank.conta;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.printf("Saldo Primeira Conta: %.2f", primeiraConta.saldo);

		// salva em uma nova conta
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.printf("\nSaldo Segunda Conta: %.2f\n", segundaConta.saldo);

		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		System.out.println(primeiraConta.titulo);

		segundaConta.agencia = 146;
		System.out.println("Agencia " + segundaConta.agencia);

		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}

		System.out.println("Memoria: " + primeiraConta); // espaço diferentes na memoria
		System.out.println("Memoria: " + segundaConta);
	}

	

}
