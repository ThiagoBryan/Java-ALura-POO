
public class testeTributaveis {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(seguro);
		calc.registra(contaCorrente);
		
		System.out.println("Impostos: " + calc.getTotalImposto());
		
	}

}
