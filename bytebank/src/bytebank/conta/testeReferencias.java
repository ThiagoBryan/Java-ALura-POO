package bytebank.conta;

public class testeReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		
		segundaConta.saldo = 200;
		System.out.println("Saldo Segunda Conta: " + segundaConta.saldo);
		System.out.println("Saldo Primeira Conta: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}
		
		System.out.println(primeiraConta); // mesmo espaço na memoria
		System.out.println(segundaConta);
	}

}
