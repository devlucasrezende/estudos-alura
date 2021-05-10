
public class Teste {
	public static void main(String[] args) {
		//Enums são para definir constantes. Jamais pode instanciar uma enumeração! O construtor é privado!
		
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;
		Prioridade pNorm = Prioridade.NORMAL;
		
		System.out.println(pMin.name());
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMax.getValor());
		System.out.println(pNorm.getValor());
	}

}
