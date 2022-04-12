package br.edu.infnet.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.pedido.model.domain.Bebida;
import br.edu.infnet.pedido.model.domain.Usuario;
import br.edu.infnet.pedido.model.service.BebidaService;

@Order(3)
@Component
public class ProdutoLoader implements ApplicationRunner {

	@Autowired
	private BebidaService bebidaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Bebida bebida = new Bebida();
		bebida.setCodigo(0);
		bebida.setGelada(false);
		bebida.setMarca("sucao");
		bebida.setNome("Suco de manga");
		bebida.setTamanho(350);
		bebida.setValor(12);
		bebida.setUsuario(usuario);

		bebidaService.incluir(bebida);
	}
}