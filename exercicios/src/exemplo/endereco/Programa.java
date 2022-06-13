package exemplo.endereco;

public class Programa {

	public static void main(String[] args) {
		
		//ERRADO PARA CORRIGIR BASTA NA CLASSE PESSOA COLOCAR Endereco endereco = new Endereco();
//		 Pessoa p = new Pessoa();
//        p.nome = "Paulo";
//        System.out.println("Nome: " + p.nome);
//        p.endereco.logradouro  = "Avenida XYZ";
//        System.out.println("Endereço: " + p.endereco.logradouro);
		
		//OU
		
		
		//CERTO
		 Pessoa pessoa = new Pessoa();
		 
		 
		 pessoa.nome = "Paulo";
	        System.out.println("Nome: " + pessoa.nome);
	        pessoa.endereco  = new Endereco();
	        pessoa.endereco.logradouro = "Avenida XYZ";
	        System.out.println("Endereço: " + pessoa.endereco.logradouro);
	    }
	}


