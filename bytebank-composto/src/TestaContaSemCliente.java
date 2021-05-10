
public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.titular); //Imprime null pois não aponta para lugar nenhum!
		//contaDaMarcela.titular.nome = "Marcela"; //não funciona antes de criar o cliente pois o titular não tem flecha para lugar nenhum. Não tem new cliente!! Vai alterar o nome de quem? 
		
		//Faz tudo numa linha só
		contaDaMarcela.titular = new Cliente();
		
		
		contaDaMarcela.titular.nome = "Marcela"; //não funciona antes de criar o cliente pois o titular não tem flecha para lugar nenhum. Não tem new cliente!! Vai alterar o nome de quem? 
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
		
		//no Java objetos sempre são acessados atraves de referência (flechinha). Não existe objeto dentro de objeto!
	}

}
