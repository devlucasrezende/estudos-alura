package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 1000;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta tem: " +primeiraConta.saldo);
		System.out.println("Segunda conta tem: " +segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Sao contas iguais");
		} else {
			System.out.println("Sao contas diferentes!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}

}
