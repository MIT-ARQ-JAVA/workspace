package br.edu.infnet.pedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Produto;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Collection<Produto> obterLista(Usuario usuario){
		return (Collection<Produto>) produtoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		produtoRepository.deleteById(id);
	}

	public Produto obterPorId(Integer id) {
		return produtoRepository.findById(id).orElse(null);
	}
}