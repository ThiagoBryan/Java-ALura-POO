

public class Conta {

    

	private double saldo;
    private Integer agencia;
    private Integer numero;
    private static int total;
    		//static serve para unificar o total de contas
    		// ele vira da classe Conta;
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("Total de contas: " + Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Nova Conta");
    }
    public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	private Cliente titular;
	

	public Integer getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Integer agencia) {
		if(agencia <=0) {
			System.out.println("numero < 0");
			return;
		}
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if(numero <=0) {
			System.out.println("numero < 0");
			return;
		}
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true; // pq deu certo
		} else {
			return false;// nao deu certo
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}

}
