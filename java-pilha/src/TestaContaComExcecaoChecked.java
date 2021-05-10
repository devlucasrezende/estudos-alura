
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
		c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("Tratamento...");
		}
	}

}
//Se quiser avisar o desenvolvedor, melhor usar checked. Se não quiser, deixar a cargo de fazer o tratamento quando quiser, usar unchecked!