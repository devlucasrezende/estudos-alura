
public class ControleBonificacao {

	private double soma;
	/*
	 * Repare que a cada novo tipo de funcionário seria necessário criar mais um método
	 * específico. Queremos que na "sala" que controla a bonificacao tenha somente
	 * uma porta a porta que se chama funcionário
	 */

	//Com um único método passando o Funcionário, qualquer novo objeto que derivar da classe funcionário vai funcionar esse método!
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
		//Mesmo passando com parâmetro funcionário (referencia genérica), quando chama o getBonificacao, SEMPRE será utilizado o método específico!!!!!
	}
	
	public double getSoma() {
		return soma;
	}

}


