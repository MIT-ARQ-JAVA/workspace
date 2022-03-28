package br.edu.infnet.pedido.model.domain;

public class Solicitante {

	private String nome;
	private String cpf;
	private String email;
	
	public Solicitante(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf= cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
}