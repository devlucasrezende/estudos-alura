
public class TestaFor {
	public static void main(String[] args) {
		
	
		
		/*no for existem tr�s espa�os (   ;    ;    )
		 * no primeiro espa�o temos a vari�vel j� declarada
		 * no segundo espa�o temos a condi��o booleana que determina se vai entrar ou n�o no la�o de repeti��o. Vai executar a pr�pria itera��o? 
		 * no terceiro espa�o temos o incremento ou decremento. O que deve ser executado no final de cada itera��o (CONDI��O DE PARADA)
		 * fora do escopo a vari�vel declarada dentro do for n�o existe
		 */
		int contador;
		
		for (contador = 0; contador <=10; contador++) {
			
			System.out.println(contador);
		}
		System.out.println(contador);
		
		//aqui o contador n�o existe!!!
	}

}
