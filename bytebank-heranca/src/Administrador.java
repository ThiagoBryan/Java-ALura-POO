
public class Administrador extends Funcionario implements Autenticavel{

	
	private AutencacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutencacaoUtil();
	}
	
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}


	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
