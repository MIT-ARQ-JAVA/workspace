package br.edu.infnet.dominio;

public class Administrativo extends Funcionario {
	private float bonus;
	private float desconto;

	public Administrativo() {
		super();
	}
	
	public Administrativo(String nome, int idade) {
		super(nome, idade);
	}	

	public Administrativo(String nome, int idade, float salario, float bonus, float desconto) {
		super(nome, idade, salario);
		this.bonus = bonus;
		this.desconto = desconto;
	}

	@Override
	protected float calcularSalarioLiquido() {
		return getSalario() + bonus - desconto;
	}

	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
}