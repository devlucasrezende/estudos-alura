package exercicios;

public class TestaCharAt {

	public static void main(String[] args) {

		String nome = "Ratin";

		for (int i = 0; i < nome.length(); i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(nome.charAt(j));

			}
			
			System.out.println();
		}

	}

}
