package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Bebida;

public class BebidaTeste {

	public static void main(String[] args) {

		Bebida b1 = new Bebida("Chopp", 10, 987);
		b1.setGelada(true);
		b1.setMarca("meuchope");
		b1.setTamanho(500);
		System.out.println(b1);

		Bebida b2 = new Bebida("Chopp", 10, 987);
		b2.setGelada(true);
		b2.setMarca("meuchope");
		b2.setTamanho(500);
		System.out.println("Valor de venda = " + b2.calcularValorVenda());
	}
}