//abstract é relacionado com herança - Não pode criar objetos dessa classe!
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //protected significa public para as classes filhas, para as outras classes fica private
	
	
	public abstract double getBonificacao (); //metodo abstrato, sem implementação
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
