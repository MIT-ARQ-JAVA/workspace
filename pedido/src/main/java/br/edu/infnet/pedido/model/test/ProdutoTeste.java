package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Bebida;

public class ProdutoTeste {

	public static void main(String[] args) {

		Bebida bebida = new Bebida("Chopp", 10, 987);
		bebida.setGelada(true);
		bebida.setMarca("meuchope");
		bebida.setTamanho(500);
		System.out.println(bebida);
	}
}