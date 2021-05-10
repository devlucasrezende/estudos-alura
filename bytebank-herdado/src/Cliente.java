//implements significa que Cliente está assinando o contrato da classe autenticável
public class Cliente implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	public Cliente () {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);;

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		//delegando a chamada para a autenticacao util
	}

	

}
