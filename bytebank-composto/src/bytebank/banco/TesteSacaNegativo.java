package bytebank.banco;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		System.out.println(conta.saldo); 
		conta.deposita(100);
		System.out.println(conta.saldo); 
		System.out.println(conta.saca(200));
		System.out.println(conta.saldo);
		
		
		System.out.println(conta.saca(101));
		
		System.out.println(conta.saldo);
		
		//PROIBIDO
		conta.saldo = conta.saldo -101;
		System.out.println(conta.saldo); 
		

	}

}
