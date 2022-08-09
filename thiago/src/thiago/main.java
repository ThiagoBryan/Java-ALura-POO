package thiago;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setCor("azul");
		carro.setId(1);
		
		System.out.println(carro.getId());
		System.out.println(carro.getCor());
		
	}

}
