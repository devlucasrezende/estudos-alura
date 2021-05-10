
public class ControleBonificacao {

	private double soma;
	/*
	 * Repare que a cada novo tipo de funcion�rio seria necess�rio criar mais um m�todo
	 * espec�fico. Queremos que na "sala" que controla a bonificacao tenha somente
	 * uma porta a porta que se chama funcion�rio
	 */

	//Com um �nico m�todo passando o Funcion�rio, qualquer novo objeto que derivar da classe funcion�rio vai funcionar esse m�todo!
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
		
		//Mesmo passando com par�metro funcion�rio (referencia gen�rica), quando chama o getBonificacao, SEMPRE ser� utilizado o m�todo espec�fico!!!!!
	}
	
	public double getSoma() {
		return soma;
	}

}


