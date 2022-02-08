package br.edu.infnet.testes;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
//		f1.nome = "elberth";
//		f1.idade = 43;
		f1.salario = 1000;
		f1.bonus = 300;
		f1.desconto = 500;
		f1.impressao();

		Funcionario f2 = new Funcionario("elberth", 43);
		f2.salario = 1000;
		f2.bonus = 300;
		f2.desconto = 500;
		f2.impressao();

		Funcionario f3 = new Funcionario("elberth", 43, 1000, 300, 500);
		f3.impressao();
	}
}