package br.edu.infnet.pedido.model.test;

import br.edu.infnet.pedido.model.domain.Bebida;
import br.edu.infnet.pedido.model.domain.Comida;
import br.edu.infnet.pedido.model.domain.Sobremesa;

public class ProdutoTeste {

	public static void main(String[] args) {

		Bebida bebida = new Bebida("Chopp", 10, 987);
		bebida.setGelada(true);
		bebida.setMarca("meuchope");
		bebida.setTamanho(500);
		System.out.println(bebida);

		Comida comida = new Comida("Fritas", 25, 963);
		
		Sobremesa sobremesa = new Sobremesa("Bolo", 15, 985);				
	}
}