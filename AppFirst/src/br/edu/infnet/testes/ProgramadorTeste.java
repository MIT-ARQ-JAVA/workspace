package br.edu.infnet.testes;

import br.edu.infnet.dominio.Programador;

public class ProgramadorTeste {

	public static void main(String[] args) {

		Programador p1 = new Programador();
		p1.setNome("huguinho");
		p1.setIdade(43);
		p1.setSalario(1000);
		p1.setFullStack(true);
		p1.setLinguagem("java");
		System.out.println(p1);

		Programador p2 = new Programador("zezinho", 43);
		p2.setSalario(2000);
		p2.setFullStack(false);
		p2.setLinguagem("python");
		System.out.println(p2);

		Programador p3 = new Programador("luizinho", 43, 3000, true, "JAVA");//2000
		System.out.println(p3);

		Programador p4 = new Programador();
		p4.setSalario(4000);
		p4.setFullStack(true);
		p4.setLinguagem("js");
		System.out.println(p4);
	}
}
