
public class SistemaInterno {
	
	private Integer senha = 222;
	
	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("Acesso permitido");
		} else {
			System.out.println("Acesso Negado");
		}
		
	}

}
