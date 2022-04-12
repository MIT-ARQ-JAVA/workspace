package br.edu.infnet.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		String email = "elberth.moraes@prof.infnet.edu.br";
		String senha = "123";
		
		if(usuarioService.validar(email, senha) == null) {
			Usuario usuario = new Usuario();
			usuario.setAdmin(true);
			usuario.setEmail(email);
			usuario.setNome("Professor Elberth");
			usuario.setSenha(senha);
			
			usuarioService.incluir(usuario);
		}		
	}
}