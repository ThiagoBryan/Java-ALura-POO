package bytebank.banco;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		Conta contaDaTata = new Conta();
		System.out.println("Saldo: " + contaDaTata.saldo);
		
		// NÃO EXISTE UM CLIENTE PARA CONTA
//		System.out.println(contaDaTata.titular);
//		contaDaTata.titular.nome = "Tata";
//		System.out.println("Nome do titular: " + contaDaTata.titular.nome);

		
		contaDaTata.titular = new Cliente();
		System.out.println(contaDaTata.titular);
		contaDaTata.titular.nome = "Tata";
		System.out.println("Nome do titular: " + contaDaTata.titular.nome);
	}

}
