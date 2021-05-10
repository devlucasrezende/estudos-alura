
public class TesteReferencias {
	public static void main(String[] args) {
		//Variável do lado esquerdo é mais genérico. Funciona pq o gerente é um funcionário!
		// Polimorfismo é "um objeto que pode ser referenciado através de uma referência do mesmo tipo (gerente g1 = new gerente) ou de uma referencia mais generica 
		//ou seja, (funcionario g1 = new gerente)
		// exemplo de polimorfismo mas sem utilidade: Funcionario g1 = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
	
		Designer d = new Designer();
		d.setSalario(2000.0);
		
		//Se fosse Funcionario g1 = new Gerente(); 
		//g1.autentica(2222);
		//Não compila pois o compilador analisa o tipo da referência e g1 é do tipo funcionário. Na classe funcionário não existe o metodo autentica 
		
		g1.setSalario(5000.0);
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		
		System.out.println(controle.getSoma());
		
	
	}

}
