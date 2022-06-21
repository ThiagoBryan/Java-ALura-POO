
public class Administrador extends Funcionario implements Autenticavel{

	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean senha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	
	@Override
	public double getBonificacao() {
		return 50;
	}


	@Override
	public boolean autentica(int senha) {
		return false;
	}

}
