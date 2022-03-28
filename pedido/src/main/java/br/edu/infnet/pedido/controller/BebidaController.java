package br.edu.infnet.pedido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.pedido.model.domain.Bebida;
import br.edu.infnet.pedido.model.service.BebidaService;

@Controller
public class BebidaController {
	
	@Autowired
	private BebidaService bebidaService;
	
	@GetMapping(value = "/bebida")
	public String cadastro() {
		return "bebida/cadastro";
	}
	
	@GetMapping(value = "/bebidas")
	public String lista(Model model) {
		
		model.addAttribute("listagem", bebidaService.obterLista());
		
		return "bebida/lista";
	}

	@PostMapping(value = "/bebida/incluir") 
	public String incluir(Model model, Bebida bebida) {
		
		bebidaService.incluir(bebida);

		return "redirect:/bebidas";
	}
	
	@GetMapping(value = "/bebida/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		bebidaService.excluir(id);
		
		return "redirect:/bebidas";
	}
}