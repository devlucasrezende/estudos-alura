
public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		/*Vamos lembrar o porque de ser escrito assim? 'Conta' (como se fosse o tipo da vari�vel, lembre-se a Classe define o tipo)
		 * 'conta' = nome da vari�vel, poderia ser qualquer asneira, tipo 'asdsdgsdf', afinal � o nome da "vari�vel";
		 * 'new Conta();' = construtor da conta, sempre ser� o nome da Classe com ().
		 */
		Conta conta = new Conta();
		conta.deposita(100);
		//System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		//Aqui � um truque, est� falando que o saldo vale o saldo -101, ent�o se o saldo � 100, ficaria com -1 e n�o � poss�vel ter saldo negativo!
		//Proibido!
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo); //N�o consegue mais acessar o saldo, temos que ter uma MANEIRA DE acessar o saldo, ou seja, criar um m�todo!
		
	
		/*O ideal � trabalhar com objeto atrav�s de m�todos, vc taca a m�o no motor do carro para ele acelerar ou usa o pedal de acelerador? Ent�o lembre-se
		 * trabalhe com m�todos e nunca atrav�s dos atributos!
		 * A forma como um carro trabalha (dentro do cap�) est� escondida, dizemos que est� ENCAPSULADO!
		 */
		
		System.out.println(conta.getSaldo()); //-> aqui consegue ler o saldo que agora est� encapsulado atraves do m�todo pegaSaldo();
		
	}

}
