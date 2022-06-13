package bytebank.banco;

public class TestaBanco {
		
	public static void main(String[] args) {
		
		Cliente thiago = new Cliente();
		
		thiago.nome = "Thiago Thurler";
		thiago.cpf = "111.111.111-11";
		thiago.profissao = "Programador";
		
		Conta contaDoThiago = new Conta();
		contaDoThiago.deposita(100);
		
		// associa o cliente thiago a conta contaDoThiago
		contaDoThiago.titular = thiago;
		System.out.println("Nome do titular: " + contaDoThiago.titular.nome);
		System.out.println("Nome do titular: " + contaDoThiago.titular);
	}
}
