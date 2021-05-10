//Aqui ta escrito "O gerente � um funcion�rio" O gerente herda da classe funcion�rio! - Classe m�e, base class ou super class o Funcion�rio
//o Gerente seria a classe filha
//Agora o gerente vai assinar o contrato do autentic�vel (implements)

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil(); // O gerente tem um Autenticacao Util - Se quer reeutiliza��o de c�digo utilize a composi��o!
	}
	
	public double getBonificacao () {
		System.out.println("Chamando o metodo de bonificacao do Gerente!");
		//super siagnifica que sal�rio � um atributo que foi declarado na class mae!
		return super.getSalario();
		//� possivel aproveitar os m�todos da classe m�e, mas lembre-se de usar o super. O super � o �culos que permite enxergar a classe mae
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
