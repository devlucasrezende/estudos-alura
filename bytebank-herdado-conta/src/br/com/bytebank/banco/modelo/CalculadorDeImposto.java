package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	//Full Qualifield Name (FQN) = br.com.bytebank.banco.modelo;
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
		
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
