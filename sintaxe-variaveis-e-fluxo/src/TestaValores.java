
public class TestaValores {
	
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
		
		//a vari�vel guarda valor e, n�o, a refer�ncia!!!!
	}

}
