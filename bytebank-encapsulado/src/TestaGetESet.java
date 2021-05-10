
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		conta.setAgencia(364);
		System.out.println(conta.getAgencia());
		
		
	}

}
