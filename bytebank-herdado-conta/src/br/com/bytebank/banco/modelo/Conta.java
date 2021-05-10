package br.com.bytebank.banco.modelo;


/**
 * Classe que representa a moldura de uma Conta
 * @author Lucas Rezende
 *
 */

public abstract class Conta {
	//Tudo que declara aqui é atributo de instância, do objeto!
	protected double saldo; // a partir do momento que vc coloca private numa variável, ela só pode ser lida
							// e modificada na própria classe onde foi declarada!!
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; //static significa = esse atributo é da classe!
	
	
	
	
	/**
	 * Construtor para inicializar o objeto conta a partir da Agencia e Numero
	 * @param agencia
	 * @param numero
	 */
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas atualmente é: " + Conta.total);
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
		this.saca(valor); //se o saca funcionar ele deposita o valor na conta destino, caso não funcione vai sair abruptamente pois tem um throw no metodo saca!
		destino.deposita(valor);
		
	}


	//Por conveção usa-se o get
	public double getSaldo() {
		return this.saldo;

	}
	
	public int getNumero () {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não é possível inserir valor menor ou igual a zero!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não é possível inserir valor menor ou igual a zero!");
			return;
		}
		this.agencia = agencia;
	}
	//metodo static = método da classe
	//Não se usa this dentro de método de classe (static);
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agencia: " + this.agencia;
	}


}
