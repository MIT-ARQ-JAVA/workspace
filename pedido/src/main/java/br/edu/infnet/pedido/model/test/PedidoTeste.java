package br.edu.infnet.pedido.model.test;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.pedido.model.domain.Bebida;
import br.edu.infnet.pedido.model.domain.Pedido;
import br.edu.infnet.pedido.model.domain.Produto;
import br.edu.infnet.pedido.model.domain.Solicitante;

public class PedidoTeste {

	public static void main(String[] args) {
		
		Bebida b1 = new Bebida("Chopp", 10, 987);
		b1.setGelada(true);
		b1.setMarca("meuchope");
		b1.setTamanho(500);
		
		Bebida b2 = new Bebida("Chopp", 10, 987);
		b2.setGelada(true);
		b2.setMarca("meuchope");
		b2.setTamanho(500);

		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(b1);
		produtos.add(b2);
		
		Solicitante solicitante = new Solicitante("elberth", "12345678912", "elberth@elberth.com");

		Pedido pedido = new Pedido();
		pedido.setDescricao("primeiro pedido");
		pedido.setProdutos(produtos);
		pedido.setSolicitante(solicitante);
		pedido.setWeb(false);
		System.out.println(pedido);
	}
}
