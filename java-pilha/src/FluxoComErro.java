public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { // ex � uma refer�ncia AritchmeticException � uma Classe e por isso existem m�tdos!
																	
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do meteodo1");
	}

	private static void metodo2() {
		System.out.println("Ini m�todo 2");
		metodo2();
		System.out.println("Fim do m�todo2"); //Erro stackoverflow - pilha cheia
		
	}
}

//try sinaliza que o c�digo � perigoso e se acontecer alguma exce��o ent�o pegue a exce��o e execute o seguinte c�digo, no nosso caso � um bloco vazio!