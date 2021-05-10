
public class Conta {
	//Tudo que declara aqui � atributo de inst�ncia, do objeto!
	private double saldo; // a partir do momento que vc coloca private numa vari�vel, ela s� pode ser lida
							// e modificada na pr�pria classe onde foi declarada!!
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static significa = esse atributo � da classe!
	
	//Construtor padr�o
	//public Conta () {
		
	//}
	
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas atualmente �: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
		
	}

	public void deposita(double valor) {
		// o this signfinica que vai adicionar usar o m�todo no objeto a qual o m�todo
		// foi invocado;
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}

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

}
