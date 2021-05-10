//Aqui ta escrito "O gerente é um funcionário" O gerente herda da classe funcionário! - Classe mãe, base class ou super class o Funcionário
//o Gerente seria a classe filha

public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do Designer!");
		return 200;
	}

}
