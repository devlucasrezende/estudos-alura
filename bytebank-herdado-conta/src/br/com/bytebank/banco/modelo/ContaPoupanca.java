package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	//reaproveita o construtor!
	public ContaPoupanca(int numero, int agencia) {
		super (numero, agencia);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}

}
