package br.edu.infnet.pedido.model.domain;

public class Comida extends Produto {

	public Comida(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	@Override
	public float calcularValorVenda() {
		return 0;
	}	
}