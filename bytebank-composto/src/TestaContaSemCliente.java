
public class TestaContaSemCliente {
	public static void main(String[] args) {
		
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.titular); //Imprime null pois n�o aponta para lugar nenhum!
		//contaDaMarcela.titular.nome = "Marcela"; //n�o funciona antes de criar o cliente pois o titular n�o tem flecha para lugar nenhum. N�o tem new cliente!! Vai alterar o nome de quem? 
		
		//Faz tudo numa linha s�
		contaDaMarcela.titular = new Cliente();
		
		
		contaDaMarcela.titular.nome = "Marcela"; //n�o funciona antes de criar o cliente pois o titular n�o tem flecha para lugar nenhum. N�o tem new cliente!! Vai alterar o nome de quem? 
		System.out.println(contaDaMarcela.titular);
		System.out.println(contaDaMarcela.titular.nome);
		
		//no Java objetos sempre s�o acessados atraves de refer�ncia (flechinha). N�o existe objeto dentro de objeto!
	}

}
