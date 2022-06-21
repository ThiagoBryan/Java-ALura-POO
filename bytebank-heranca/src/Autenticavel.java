//INTERFACE 
//CONTRATO AUTENTICAVEL
// QUEM ASSINAR ESSE CONTRATO, PRECISA IMPLEMENTAR 
//TODOS SEUS METODOS
public abstract interface Autenticavel {

	

	public abstract void setSenha(int senha); 

	public abstract boolean autentica(int senha);

}
