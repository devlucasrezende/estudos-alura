
public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337,24226);
		Conta conta2 = new Conta(1337,16549);
		//Isso aqui não é legal, numero de conta e agência com valores negativos!
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia()); //Mesmo fazendo if no método, ainda aparece zero, pois é o valor default! As vezes um objeto nasce inconsistente!
		
		System.out.println(Conta.getTotal());
	}

}
