
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.221.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//composi��o de objetos
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.nome);
		
	}

}
