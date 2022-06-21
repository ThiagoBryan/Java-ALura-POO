
public class TesteGerente {

	public static void main(String[] args) {
		Autenticavel referencia = new Gerente();

		Gerente gerente = new Gerente();
		
		gerente.setNome("Tata");
		gerente.setCpf("987.654.321-55");
		gerente.setSalario(5000.00);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		System.out.println(gerente.getBonificacao());

		
		gerente.setSenha(22222);
		boolean outraSenha = gerente.autentica(22222);
		System.out.println(outraSenha);
		
	}

}
