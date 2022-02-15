package br.edu.infnet.testes;

import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Contato;

public class AdministrativoTeste {

	public static void main(String[] args) {

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

		Administrativo a2 = new Administrativo("elberth", 43);
		a2.setSalario(1000);
		a2.setBonus(300);
		a2.setDesconto(500);
		a2.impressao();

		Administrativo a3 = new Administrativo("elberth", 43, 1000, 300, 500);
		a3.impressao();

		Administrativo a4 = new Administrativo();
		a4.setSalario(1000);
		a4.setBonus(300);
		a4.setDesconto(500);
		a4.impressao();
	}
}