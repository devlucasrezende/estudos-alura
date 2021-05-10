
public class TesteConexao {

	public static void main(String[] args) {
		
		//Try simplificado
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na Conexão");
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
/* a ideia do finally é sempre executar um bloco de código, com ou sem erro!
 * Um try sozinho nunca é válido, ele exige ou um catch (pode ter vários) ou um finally (só pode ter 1 finally)
 */
