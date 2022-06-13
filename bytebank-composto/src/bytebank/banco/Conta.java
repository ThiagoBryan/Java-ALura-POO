package bytebank.banco;

public class Conta {

    double saldo;
	Integer agencia;
	Integer numero;
	String titulo;
	Cliente titular;
	

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
