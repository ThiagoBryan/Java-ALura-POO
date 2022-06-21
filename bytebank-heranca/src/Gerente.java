// herda os atributos do Funcionario
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;

	public Gerente() {
		super();
	}

	public double getBonificacao() {
		System.out.println("Bonificação GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
