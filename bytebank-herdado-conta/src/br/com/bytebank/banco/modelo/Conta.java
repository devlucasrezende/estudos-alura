package br.com.bytebank.banco.modelo;


/**
 * Classe que representa a moldura de uma Conta
 * @author Lucas Rezende
 *
 */

public abstract class Conta {
	//Tudo que declara aqui � atributo de inst�ncia, do objeto!
	protected double saldo; // a partir do momento que vc coloca private numa vari�vel, ela s� pode ser lida
							// e modificada na pr�pria classe onde foi declarada!!
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; //static significa = esse atributo � da classe!
	
	
	
	
	/**
	 * Construtor para inicializar o objeto conta a partir da Agencia e Numero
	 * @param agencia
	 * @param numero
	 */
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas atualmente �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta " + this.numero);
		
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */

	public void saca(double valor) throws SaldoInsuficienteException {
		//Problema
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " +this.saldo + ", Valor: " +valor);
		} 
		this.saldo -= valor; 
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor); //se o saca funcionar ele deposita o valor na conta destino, caso n�o funcione vai sair abruptamente pois tem um throw no metodo saca!
		destino.deposita(valor);
		
	}


	//Por conve��o usa-se o get
	public double getSaldo() {
		return this.saldo;

	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o � poss�vel inserir valor menor ou igual a zero!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o � poss�vel inserir valor menor ou igual a zero!");
			return;
		}
		this.agencia = agencia;
	}
	//metodo static = m�todo da classe
	//N�o se usa this dentro de m�todo de classe (static);
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.numero + ", Agencia: " + this.agencia;
	}


}
