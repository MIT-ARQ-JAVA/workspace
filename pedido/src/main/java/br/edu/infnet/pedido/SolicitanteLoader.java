package br.edu.infnet.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.pedido.model.domain.Solicitante;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.service.SolicitanteService;

@Order(2)
@Component
public class SolicitanteLoader implements ApplicationRunner {

	@Autowired
	private SolicitanteService solicitanteService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Solicitante solicitante = new Solicitante();
		solicitante.setCpf("99999999999");
		solicitante.setEmail("zezinho@zezinho.com");
		solicitante.setNome("Zezinho");
		
		solicitante.setUsuario(usuario);
		
		solicitanteService.incluir(solicitante);
	}
}
