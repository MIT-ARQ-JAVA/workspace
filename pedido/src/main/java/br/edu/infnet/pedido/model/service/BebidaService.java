package br.edu.infnet.pedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Bebida;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.repository.BebidaRepository;

@Service
public class BebidaService {

	@Autowired
	private BebidaRepository bebidaRepository;
	
	public Collection<Bebida> obterLista(Usuario usuario){
		return (Collection<Bebida>) bebidaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "marca"));
	}

	public void incluir(Bebida bebida) {
		bebidaRepository.save(bebida);
	}
	
	public void excluir(Integer id) {
		bebidaRepository.deleteById(id);
	}
}