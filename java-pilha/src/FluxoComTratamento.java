public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { // ex é uma referência AritchmeticException é uma Classe e por isso existem métdos!
																	
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
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			 int a = i / 0;
			//Conta c = null;
			//c.deposita();
		}
		System.out.println("Fim do método2");
	}
}

//try sinaliza que o código é perigoso e se acontecer alguma exceção então pegue a exceção e execute o seguinte código, no nosso caso é um bloco vazio!