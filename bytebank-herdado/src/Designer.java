//Aqui ta escrito "O gerente � um funcion�rio" O gerente herda da classe funcion�rio! - Classe m�e, base class ou super class o Funcion�rio
//o Gerente seria a classe filha

public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do Designer!");
		return 200;
	}

}
