// herda os atributos do Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private AutencacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutencacaoUtil();
	}

	public double getBonificacao() {
		System.out.println("Bonificação GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	
}
