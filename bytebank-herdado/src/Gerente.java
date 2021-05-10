//Aqui ta escrito "O gerente é um funcionário" O gerente herda da classe funcionário! - Classe mãe, base class ou super class o Funcionário
//o Gerente seria a classe filha
//Agora o gerente vai assinar o contrato do autenticável (implements)

public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil(); // O gerente tem um Autenticacao Util - Se quer reeutilização de código utilize a composição!
	}
	
	public double getBonificacao () {
		System.out.println("Chamando o metodo de bonificacao do Gerente!");
		//super siagnifica que salário é um atributo que foi declarado na class mae!
		return super.getSalario();
		//É possivel aproveitar os métodos da classe mãe, mas lembre-se de usar o super. O super é o óculos que permite enxergar a classe mae
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
