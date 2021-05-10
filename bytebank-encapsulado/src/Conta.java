
public class Conta {
	//Tudo que declara aqui é atributo de instância, do objeto!
	private double saldo; // a partir do momento que vc coloca private numa variável, ela só pode ser lida
							// e modificada na própria classe onde foi declarada!!
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static significa = esse atributo é da classe!
	
	//Construtor padrão
	//public Conta () {
		
	//}
	
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas atualmente é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
		
	}

	public void deposita(double valor) {
		// o this signfinica que vai adicionar usar o método no objeto a qual o método
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

}
