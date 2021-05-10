//Contrato = Autenticavel
//Quem assina o contrato precisa implementar o metodo setSenha e autentica
//Interface é uma alternativa para o polimorfismo!

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha); 

	public abstract boolean autentica(int senha); 

}
