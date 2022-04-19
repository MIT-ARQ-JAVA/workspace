package br.edu.infnet.pedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Pedido;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public Collection<Pedido> obterLista(Usuario usuario){
		return pedidoRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "data"));
	}
	
	public Collection<Pedido> obterLista(){
		return pedidoRepository.findAll(Sort.by(Sort.Direction.ASC, "data"));
	}
	
	public void incluir(Pedido pedido) {
		pedidoRepository.save(pedido);
	}
	
	public void excluir(Integer id) {
		pedidoRepository.deleteById(id);
	}
	
	public Pedido obterPorId(Integer id) {
		return pedidoRepository.findById(id).orElse(null);
	}
}