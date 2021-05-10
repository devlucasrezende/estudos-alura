public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) { //Exception ex é um catch polimórfico, ou seja, deriva ta classe Exception que por sua vez é mãe da classe RunTimeException por isso fica genérico!
																	
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1()  throws MinhaExcecao{
		System.out.println("Ini do metodo1");
		
		metodo2();
		
		System.out.println("Fim do meteodo1");
	}

	private static void metodo2() throws MinhaExcecao { //throws na assinatura do método sinaliza que esse método é perigoso
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Deu muito pepino"); // é possivel passar uma mensagem dentro do construtor!
		
		
		//System.out.println("Fim do método2");
	}
}

//try sinaliza que o código é perigoso e se acontecer alguma exceção então pegue a exceção e execute o seguinte código, no nosso caso é um bloco vazio!
//Exception uncheck, o compilador não verifica (pode rodar a aplicação mas no meio do caminho vai bugar - runTimeException) Já as excpetion checked o próprio compilador verifica e se estiver problema, sequer compila!
 