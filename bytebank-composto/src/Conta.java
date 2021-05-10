
public class Conta {

	private double saldo; // a partir do momento que vc coloca private numa variável, ela só pode ser lida
							// e modificada na própria classe onde foi declarada!!
	int agencia;
	int numero;
	Cliente titular;

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

}
