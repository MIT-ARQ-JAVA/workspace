package br.edu.infnet.pedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Solicitante;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
	
	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public Collection<Solicitante> obterLista(Usuario usuario){
		return (Collection<Solicitante>) solicitanteRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void incluir(Solicitante solicitante) {
		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {
		solicitanteRepository.deleteById(id);
	}	
}