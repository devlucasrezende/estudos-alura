package br.com.bytebank.banco.modelo;

//Quando se usa a heran�a (extends) vai herdar os atributos e m�todos, mas construtores n�o s�o herdados!!
public class ContaCorrente extends Conta implements Tributavel{

//	public ContaCorrente () {
//		super(); //chamada do construtor da classe m�e. Ele � impl�cito! Sen�o escreve super() n�o tem problema! Funcionaria se tivesse um construtor padr�o na classe m�e
//	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Inten��o de sobrescrever o m�todo!
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}

}
