package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		
		//String vazio = " ";
		//Uma String não pode ser alterado, imutabilidade
		String nome = "Alura"; //cria um objeto sem usar 'new' - object literal
		//String outro = new String ("Alura"); - má prática 
		
		System.out.println(nome.contains("lur"));
		//System.out.println(nome.length());
		
//		for (int i = 0; i < nome.length(); i++) {
//			System.out.println(nome.charAt(i));
//		}
		
		//System.out.println(vazio.isEmpty()); //lembrar que espaço não é igual vazio!
//		String outrovazio = vazio.trim(); //tira os espaços!
//		
//		System.out.println(outrovazio.isEmpty());

		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
	
		
//Lembrar do zero base, começa sempre com 0;
//		char c = nome.charAt(0);
//		System.out.println(c);

//		char c = 'A';
//		char d = 'a';
	
//		String outro = nome.replace(c, d);
		
		//String outro = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outro);
		
		
		
	}

}
