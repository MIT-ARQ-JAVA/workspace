package br.edu.infnet.testes;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	float bonus;
	float desconto;
	
	public Funcionario() {
		this.nome = "fantasma";
		this.idade = 99;
	}
	
	public Funcionario(String nome, int idade) {
		this();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return nome + ";" + idade;
	}
	
	void impressao(){
		System.out.println("O funcionário: " + this);
	}
}