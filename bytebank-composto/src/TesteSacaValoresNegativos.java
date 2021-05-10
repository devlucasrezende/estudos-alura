
public class TesteSacaValoresNegativos {
	public static void main(String[] args) {
		/*Vamos lembrar o porque de ser escrito assim? 'Conta' (como se fosse o tipo da variável, lembre-se a Classe define o tipo)
		 * 'conta' = nome da variável, poderia ser qualquer asneira, tipo 'asdsdgsdf', afinal é o nome da "variável";
		 * 'new Conta();' = construtor da conta, sempre será o nome da Classe com ().
		 */
		Conta conta = new Conta();
		conta.deposita(100);
		//System.out.println(conta.saca(200));
		//System.out.println(conta.saldo);
		
		//Aqui é um truque, está falando que o saldo vale o saldo -101, então se o saldo é 100, ficaria com -1 e não é possível ter saldo negativo!
		//Proibido!
		//conta.saldo = conta.saldo - 101;
		//System.out.println(conta.saldo); //Não consegue mais acessar o saldo, temos que ter uma MANEIRA DE acessar o saldo, ou seja, criar um método!
		
	
		/*O ideal é trabalhar com objeto através de métodos, vc taca a mão no motor do carro para ele acelerar ou usa o pedal de acelerador? Então lembre-se
		 * trabalhe com métodos e nunca através dos atributos!
		 * A forma como um carro trabalha (dentro do capô) está escondida, dizemos que está ENCAPSULADO!
		 */
		
		System.out.println(conta.getSaldo()); //-> aqui consegue ler o saldo que agora está encapsulado atraves do método pegaSaldo();
		
	}

}
