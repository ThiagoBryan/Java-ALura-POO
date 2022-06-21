			// herda os atributos do funcionario
public class Gerente extends Funcionario {
	
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public Gerente() {
		super();
	}
	
	public boolean senha(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
		System.out.println("Bonificação GERENTE");
		return super.getSalario();
	}

}
