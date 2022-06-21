
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Thiago");
		gerente.setSalario(5000.00);

		//ABSTRATO
//		Funcionario funcionario = new Funcionario();
//		funcionario.setSalario(2000.00);

		EditorDeVideo editorDeVideo = new EditorDeVideo();
		editorDeVideo.setSalario(2500.00);
		
		Designer designer = new Designer();
		designer.setSalario(2000.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editorDeVideo);
		controle.registra(designer);

		System.out.println(controle.getSoma());
	}

}
