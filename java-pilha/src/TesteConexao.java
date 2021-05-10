
public class TesteConexao {

	public static void main(String[] args) {
		
		//Try simplificado
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na Conex�o");
		}
		
		
		
		//-----------------------------------------------------
//		Conexao con = null;
//
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			
//			System.out.println("Deu erro na conexao");
//			
//		} finally {
//			System.out.println("Finally");
//			if(con != null) {
//				con.close();
//			}
//			
//		}
		
	}

}
/* a ideia do finally � sempre executar um bloco de c�digo, com ou sem erro!
 * Um try sozinho nunca � v�lido, ele exige ou um catch (pode ter v�rios) ou um finally (s� pode ter 1 finally)
 */
