package br.edu.infnet.testes;

public class Primeiro {
	
	private static String nome;
	private static String sobrenome;
	private static int idade; 
	private static float salario;
	private static boolean devJava;
	private static int qtde;

	private static boolean validar(int tamanho) {		
		return tamanho == 6;
	}
	
	private static int calcularAnoNascimento(int aIdade){
		return 2022 - aIdade;
	}
	
	private static float calcularSalarioTotal(float oSalario, int aQtde){
		return oSalario * aQtde;
	}
	
	private static String obterSituacao(int aIdade){
		return aIdade <= 50 ? "iniciante" : "veterano";
	}
	
	private static String obterStatus(float oSalarioTotal){
		return oSalarioTotal > 1000 ? "estável" : "instável";
	}
	
	private static void tratarParametros(String[] argumentos){
		nome = argumentos[0];
		sobrenome = argumentos[1];
		idade = Integer.valueOf(argumentos[2]);
		salario = Float.valueOf(argumentos[3]);			
		devJava = Boolean.valueOf(argumentos[4]);
		qtde = Integer.valueOf(argumentos[5]);
	}
	
	private static void impressao(){
		float salarioTotal = calcularSalarioTotal(salario, qtde);

		System.out.printf("Olá, %s %s. Você tem %d anos (%d), ganha R$%.2f e %s [%s | %s]!!!", 				
				nome, 
				sobrenome,
				idade,
				calcularAnoNascimento(idade),
				salarioTotal,
				devJava ? "é java dev" : "não é java dev",
				obterSituacao(idade),
				obterStatus(salarioTotal)
			);		
	}

	public static void main(String[] args) {

		if(validar(args.length)) {
			
			tratarParametros(args);
			
			impressao();
			
		} else {
			System.out.println("Impossível exibir o relatório!!!");
		}
	}
}