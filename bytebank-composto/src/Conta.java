
public class Conta {

	private double saldo; // a partir do momento que vc coloca private numa vari�vel, ela s� pode ser lida
							// e modificada na pr�pria classe onde foi declarada!!
	int agencia;
	int numero;
	Cliente titular;

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

}
