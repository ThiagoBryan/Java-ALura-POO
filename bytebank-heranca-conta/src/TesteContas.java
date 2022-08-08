
public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 22222);
		cc.deposita(100.00);
		
		ContaPoupanca cp = new ContaPoupanca(222, 33333);
		cp.deposita(200.00);
		
		try {
			cc.transfere(10.00, cp);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		
	}

}
