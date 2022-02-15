package br.edu.infnet.testes;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.dominio.Administrativo;
import br.edu.infnet.dominio.Contato;
import br.edu.infnet.dominio.Empresa;
import br.edu.infnet.dominio.Funcionario;
import br.edu.infnet.dominio.Programador;

public class EmpresaTeste {

	public static void main(String[] args) {

		Administrativo adm1 = new Administrativo();
		//setters
		
		Programador prog1 = new Programador();
		//setters
		
		Administrativo adm2 = new Administrativo();
		//setters
		
		Programador prog2 = new Programador();
		//setters
		
		List<Funcionario> colecaoFuncionarios = new ArrayList<Funcionario>();
		colecaoFuncionarios.add(adm1);
		colecaoFuncionarios.add(adm2);
		colecaoFuncionarios.add(prog1);
		colecaoFuncionarios.add(prog2);

		Contato contato = new Contato();
		contato.setEmail("emp@emp.com");
		contato.setTelefone("23123123");
		
		Empresa empresa = new Empresa();
		empresa.setEndereco("rua da empresa, 10");
		empresa.setRazaoSocial("empresa do elberth");
		
		empresa.setContato(contato);
		
		empresa.setFuncionarios(colecaoFuncionarios);

		System.out.println(empresa);		
	}
}
