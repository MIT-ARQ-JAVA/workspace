package br.edu.infnet.testes;

import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Contato;
import br.edu.infnet.dominio.Programador;

public class FuncionarioTeste {

	public static void main(String[] args) {
		//Funcionário administrativo
		Contato cont1 = new Contato();
		cont1.setEmail("elberth@moraes.com");
		cont1.setTelefone("123123123");
		Administrativo a1 = new Administrativo();
		a1.setNome("elberth");
		a1.setIdade(43);
		a1.setSalario(1000);
		a1.setBonus(300);
		a1.setDesconto(500);
		a1.setContato(cont1);				
		a1.impressao();

		//Funcionário programador
		Contato cont2 = new Contato();
		cont2.setEmail("elberth@moraes.com");
		cont2.setTelefone("123123123");
		Programador p1 = new Programador();
		p1.setNome("huguinho");
		p1.setIdade(43);
		p1.setSalario(1000);
		p1.setFullStack(true);
		p1.setLinguagem("java");
		p1.setContato(cont2);
		System.out.println(p1);
	}
}
