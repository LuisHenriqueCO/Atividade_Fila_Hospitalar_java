package atividade_hospital;

import java.util.Scanner;

//Eu estou encontrando problemas no momento do input, que algumas vezes funciona e as vezes não, e única solução que encontrei
//foi criar um input para cada variavel

public class Main {
	
	static Gestao_Hospital gestao = new Gestao_Hospital();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("========================================");
			System.out.println("1 - Adicionar paciente");
			System.out.println("2 - Atender paciente");
			System.out.println("3 - Exibir pacientes");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			int opcao = input.nextInt();
			
			if (opcao == 0) {
				System.out.println("Até mais");
				break;
			} else if (opcao == 1) {
				System.out.print("Insira o nome do paciente: ");
				Scanner nome = new Scanner(System.in);
				String nome_paciente = nome.nextLine();
				gestao.adicionar_paciente(nome_paciente);
			} else if (opcao == 2) {
				gestao.atender_paciente();
			} else if (opcao == 3) {
				gestao.exibir_pacientes();
			} else {
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
		}
	}
}
