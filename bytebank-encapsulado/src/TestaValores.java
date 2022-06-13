
public class TestaValores {

	public static void main(String[] args) {

		Conta conta = new Conta(1337, 24226);
		
		//conta inconsistente
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16459);
		Conta conta3 = new Conta(2112, 11456);
		
		System.out.println("Total de Contas: " + Conta.getTotal());

	}

}
