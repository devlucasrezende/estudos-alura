package br.com.bytebank.banco.modelo;


/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Lucas Rezende
 * @version 0.1
 */



public class Cliente {
	
	String nome;
	String cpf;
	String profissao;
	
	public String geNome() {
		return nome;
	}

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

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
