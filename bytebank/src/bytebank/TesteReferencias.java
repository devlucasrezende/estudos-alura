package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		
		// referencias vs objetos
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Segunda da segunda conta: " +segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Segunda da segunda conta: " +segundaConta.saldo);
		
		System.out.println("Segunda da primeira conta: " +primeiraConta.saldo);
		
		//o == compara referencias, a segunda conta aponta para a referencia da primeira conta, portanto, trata-se da mesma conta. Repare que não há 2 new no código.
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmissima conta");
		}
		//impressao das referencias, que são iguais
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
