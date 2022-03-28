package br.edu.infnet.pedido.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.pedido.model.domain.Bebida;

@Service
public class BebidaService {
	
	private static Map<Integer, Bebida> mapa = new HashMap<Integer, Bebida>();
	
	private static Integer key = 1;

	public Collection<Bebida> obterLista(){
		return mapa.values();
	}

	public void incluir(Bebida bebida) {
		bebida.setId(key++);
		mapa.put(bebida.getId(), bebida);
	}
	
	public void excluir(Integer id) {
		mapa.remove(id);
	}
}