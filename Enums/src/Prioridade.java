
public enum Prioridade {
	
	MIN(1),NORMAL(5),MAX(10); //Instancias da classe prioridade!
	
	//MIN = 0, Normal = 1, Max = 2 ... � gerado de forma autom�tica!
	
	private int valor;
	
	Prioridade (int valor) {
		this.valor = valor;
		
	}
	
	public int getValor () {
		return this.valor;
	}

}
