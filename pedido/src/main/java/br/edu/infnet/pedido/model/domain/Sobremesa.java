package br.edu.infnet.pedido.model.domain;

public class Sobremesa extends Produto {

	public Sobremesa(String nome, float valor, int codigo) {
		super(nome, valor, codigo);
	}

	@Override
	public float calcularValorVenda() {
		return 0;
	}
}