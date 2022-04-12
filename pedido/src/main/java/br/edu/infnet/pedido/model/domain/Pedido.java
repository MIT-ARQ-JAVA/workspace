package br.edu.infnet.pedido.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {
	
	private String descricao;
	private LocalDateTime data;
	private boolean web;
	private List<Produto> produtos;
	private Solicitante solicitante;
	
	public Pedido() {
		data = LocalDateTime.now();
		descricao = "Pedido web";
		web = true;
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		return String.format("%s;%s;%s;%d", 
				descricao, 
				data.format(formato), 
				web ? "internet" : "loja",
				produtos.size()
			);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public LocalDateTime getData() {
		return data;
	}
}
