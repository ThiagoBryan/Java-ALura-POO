
public class Cliente implements Autenticavel {


	private AutencacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutencacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
			

	

}
