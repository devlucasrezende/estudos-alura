package br.com.bytebank.banco.modelo;

//Quando se usa a herança (extends) vai herdar os atributos e métodos, mas construtores não são herdados!!
public class ContaCorrente extends Conta implements Tributavel{

//	public ContaCorrente () {
//		super(); //chamada do construtor da classe mãe. Ele é implícito! Senão escreve super() não tem problema! Funcionaria se tivesse um construtor padrão na classe mãe
//	}

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Intenção de sobrescrever o método!
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
