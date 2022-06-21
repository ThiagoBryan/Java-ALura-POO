//NAO PODE SER INTANCIADA(CRIAR OBJETOS DESSA CLASSE) 
//POIS ESTA COMO ABSTRACT;
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Abstratct: método sem corpo, não tem implementação, deve ser feita nos filhos;
	public abstract double getBonificacao(); 
}
