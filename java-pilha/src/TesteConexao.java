
public class TesteConexao {
	 
	public static void main(String[] args) {
		//CODIGO MAIS RECENTE
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		}catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		
		
		
		
		//-------------------------------------------
//		Conexao conexao = null;
//		try {
//			conexao = new Conexao();
//			conexao.leDados();
//		}catch(IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o");
//		}finally { // sempre vai executar mesmo com exception
//			System.out.println("Finally");
//			if(conexao != null) {
//				conexao.close();
//			}
//		}
				

	    }
}
