
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		// Conta numero
		//conta.setNumero(1337);
		System.out.println("N�mero da conta: " + conta.getNumero());
		
		//conta.setAgencia(111);
		System.out.println("Ag�ncia: " + conta.getAgencia());
		
		Cliente thiago = new Cliente();
		
		//conta.titular = thiago;
		thiago.setNome("Thiago Bryan"); 
		
		conta.setTitular(thiago);
		
		System.out.println("Titular: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//agora em duas linhas
		Cliente profissao = conta.getTitular();
		profissao.setProfissao("Programador");
		
		System.out.println("Profiss�o: " + conta.getTitular().getProfissao());
		
		//mesmo espa�o na mem�ria
		 System.out.println(profissao);
		 System.out.println(thiago);
		 System.out.println(conta.getTitular());
		
	}

}
