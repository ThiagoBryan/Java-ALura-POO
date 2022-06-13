package bytebank.conta;

public class testaMetodo {

	public static void main(String[] args) {
		
		System.out.println("\tDepósito");
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 100;
		
		conta1.deposita(50);
		System.out.println("Deposito de: " + conta1.saldo);
		
		System.out.println("\n\tSaque");
		
		boolean saque = conta1.saca(50);
		System.out.println("Saque de: " + conta1.saldo);
		System.out.println("Saque feito? " + saque);
		System.out.println("Saldo de: " + conta1.saldo);
	   
		System.out.println("Saque feito? " + conta1.saca(500));
		
		System.out.println("\n\tTransferência");
		
		Conta conta2 = new Conta();
		
		System.out.println("saldo conta1: " + conta1.saldo);
		System.out.println("saldo conta2: " + conta2.saldo);
		
		conta2.deposita(1000);
		
		if(conta2.transfere(500, conta1)){
			System.out.println("Transferência feita");
		}else {
			System.out.println("saldo indisponível");
		}	
		
		System.out.println("saldo conta1: " + conta1.saldo);
		System.out.println("saldo conta2: " + conta2.saldo);

	}

}
