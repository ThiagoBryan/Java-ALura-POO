

public abstract class Conta {
	
	protected double saldo;
    private Integer agencia;
    private Integer numero;
	private Cliente titular;
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
	

	public Integer getAgencia() {
		return this.agencia;
	}

	public void setAgencia(Integer agencia) {
		if(agencia <=0) {
			System.out.println("numero < 0, deve ser > 0");
			return;
		}
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if(numero <=0) {
			System.out.println("numero < 0, deve ser > 0");
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

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
	}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); 
			destino.deposita(valor);
			
	}

}
