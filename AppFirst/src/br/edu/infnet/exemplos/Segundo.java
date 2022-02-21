package br.edu.infnet.exemplos;

import java.util.Scanner;

public class Segundo {
	
	private static String[] nomes;
	private static int[] idades;
	private static float[] salarios;
	private static float[] bonus;
	private static float[] descontos;
	
	private static int index;

	private static void impressao(){
		for(int i=0;i<index;i++) {
			impressao(i);
		}
	}
	
	private static void impressao(int idx){
		float salarioLiquido = calcularSalarioLiquido(idx);

		System.out.printf("- %d : %s - %d - %.2f :: %s\n", 
				idx, 
				nomes[idx], 
				idades[idx], 
				salarioLiquido,
				obterSituacao(salarioLiquido)
			);
	}
	
	private static float calcularSalarioLiquido(int indice){
		return salarios[indice] + bonus[indice] - descontos[indice];
	}	
	
	private static String obterSituacao(float sl){		
		return sl >= 100000 ? "rico" : "pobre";
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int qtde = Integer.valueOf(args[0]);

		nomes =	new String[qtde];
		idades = new int[qtde];
		salarios = new float[qtde];
		bonus = new float[qtde];
		descontos = new float[qtde];

		String opcao = null;

		do {
			System.out.println("[1] Cadastrar");
			System.out.println("[2] Consultar um");
			System.out.println("[3] Consultar todos");
			System.out.println("[4] Sair");
			
			System.out.print("Informe a opção desejada: ");
			opcao = in.next();

			switch (opcao) {
			case "1":
				if(index < qtde) {
					System.out.println("Informe o seu nome:");
					nomes[index] = in.next();
	
					System.out.println("Informe a sua idade:");
					idades[index] = in.nextInt();
	
					System.out.println("Informe o seu salário:");
					salarios[index] = in.nextFloat();
					
					System.out.println("Informe o seu bônus:");
					bonus[index] = in.nextFloat();

					System.out.println("Informe o seu desconto:");
					descontos[index] = in.nextFloat();

					impressao(index);
	
					index++;
				} else {
					System.out.println("Impossível realizar um novo cadastramento!!!");
				}
								
				break;

			case "2":
				System.out.print("Informe o funcionário desejado: ");
				int posicao = in.nextInt();

				if(posicao >= 0 && posicao < index) {
					impressao(posicao);
				} else {
					System.out.printf("Funcionário %d inexistente!!!\n", posicao);
				}
				break;

			case "3":
				impressao();
				break;

			case "4":
				System.out.println("sair");
				break;
			default:
				System.out.println("Opção inválida!!!");
				break;
			}
		} while (!"4".equals(opcao));

		System.out.println("Processamento finalizado");
		
		in.close();
	}
}