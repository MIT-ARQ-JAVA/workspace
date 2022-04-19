package br.edu.infnet.pedido.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticacao(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
}