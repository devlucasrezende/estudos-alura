public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) { //Exception ex � um catch polim�rfico, ou seja, deriva ta classe Exception que por sua vez � m�e da classe RunTimeException por isso fica gen�rico!
																	
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

	private static void metodo2() throws MinhaExcecao { //throws na assinatura do m�todo sinaliza que esse m�todo � perigoso
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Deu muito pepino"); // � possivel passar uma mensagem dentro do construtor!
		
		
		//System.out.println("Fim do m�todo2");
	}
}

//try sinaliza que o c�digo � perigoso e se acontecer alguma exce��o ent�o pegue a exce��o e execute o seguinte c�digo, no nosso caso � um bloco vazio!
//Exception uncheck, o compilador n�o verifica (pode rodar a aplica��o mas no meio do caminho vai bugar - runTimeException) J� as excpetion checked o pr�prio compilador verifica e se estiver problema, sequer compila!
 