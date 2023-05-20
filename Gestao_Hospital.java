package atividade_hospital;

import java.util.Arrays;
import java.util.Scanner;

public class Gestao_Hospital {
	
	Scanner input = new Scanner(System.in);
	
	FilaNormal filaNormal = new FilaNormal();
	FilaLeve filaLeve = new FilaLeve();
	FilaModerado filaModerado = new FilaModerado();
	FilaSevero filaSevero = new FilaSevero();
	FilaPrioridade filaPrioridade = new FilaPrioridade(Arrays.asList("Severo", "Moderado", "Leve", "Severo", "Moderado", "Severo", "Normal"));
	
	public void adicionar_paciente(String paciente) {
		System.out.println("Qual o estado do paciente?");
		System.out.println("1 - Normal");
		System.out.println("2 - Leve");
		System.out.println("3 - Moderado");
		System.out.println("4 - Severo");
		System.out.print("-> ");
		int valor = input.nextInt();
		
		if (valor == 1) {
			filaNormal.enqueue(paciente);
		} else if (valor == 2) {
			filaLeve.enqueue(paciente);
		} else if (valor == 3) {
			filaModerado.enqueue(paciente);
		} else if (valor == 4 ) {
			filaSevero.enqueue(paciente);
		} else {
			System.out.println("Opção inválida");
		}
	}
	
	public void atender_paciente() {
		if (filaPrioridade.get(0) == "Severo") {
			if (filaSevero.isEmpty()) {
				System.out.println("--------------------------------------");
				System.out.println("A fila de estado Severo está vazia");
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Severo");
			} else {
				System.out.println("--------------------------------------");
				System.out.println("O paciente " + filaSevero.get(0) + " em estado Severo foi atendido");
				filaSevero.dequeue();
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Severo");
			}
		} else if (filaPrioridade.get(0) == "Moderado") {
			if (filaModerado.isEmpty()) {
				System.out.println("--------------------------------------");
				System.out.println("A fila de estado Moderado está vazia");
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Moderado");
			} else {
				System.out.println("--------------------------------------");
				System.out.println("O paciente " + filaModerado.get(0) + " em estado Moderado foi atendido");
				filaModerado.dequeue();
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Moderado");
			}
		} else if (filaPrioridade.get(0) == "Leve") {
			if (filaLeve.isEmpty()) {
				System.out.println("--------------------------------------");
				System.out.println("A fila de estado Leve está vazia");
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Leve");
			} else {
				System.out.println("--------------------------------------");
				System.out.println("O paciente " + filaLeve.get(0) + " em estado Leve foi atendido");
				filaLeve.dequeue();
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Leve");
			}
		} else if (filaPrioridade.get(0) == "Normal") {
			if (filaNormal.isEmpty()) {
				System.out.println("--------------------------------------");
				System.out.println("A fila de estado Normal está vazia");
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Normal");
			} else {
				System.out.println("--------------------------------------");
				System.out.println("O paciente " + filaNormal.get(0) + " em estado Normal foi atendido");
				filaNormal.dequeue();
				filaPrioridade.dequeue();
				filaPrioridade.enqueue("Normal");
			}
		}
	}
	
	public void exibir_pacientes() {
		if (filaNormal.isEmpty()) {
			System.out.println("--------------------------------------");
			System.out.println("A fila de pacientes em estado Normal está vazia.");
		} else {
			System.out.println("--------------------------------------");
			System.out.println("Pacientes em estado Normal:");
			for (int i = 0; i < filaNormal.size(); i++) {
	            String paciente = filaNormal.get(i);
	            System.out.println(i+1 + " - " + paciente);
	        }
		}
		
		if (filaLeve.isEmpty()) {
			System.out.println("--------------------------------------");
			System.out.println("A fila de pacientes em estado Leve está vazia.");
		} else {
			System.out.println("--------------------------------------");
			System.out.println("Pacientes em estado Leve:");
			for (int i = 0; i < filaLeve.size(); i++) {
	            String paciente = filaLeve.get(i);
	            System.out.println(i+1 + " - " + paciente);
	        } 

		}
		
		if (filaModerado.isEmpty()) {
			System.out.println("--------------------------------------");
			System.out.println("A fila de pacientes em estado Moderado está vazia.");
		} else {
			System.out.println("--------------------------------------");
			System.out.println("Pacientes em estado Moderado:");
			for (int i = 0; i < filaModerado.size(); i++) {
	            String paciente = filaModerado.get(i);
	            System.out.println(i+1 + " - " + paciente);
	        }
		}
		
		if (filaSevero.isEmpty()) {
			System.out.println("--------------------------------------");
			System.out.println("A fila de pacientes em estado Severo está vazia.");
		} else {
			System.out.println("--------------------------------------");
			System.out.println("Pacientes em estado Severo:");
			for (int i = 0; i < filaSevero.size(); i++) {
	            String paciente = filaSevero.get(i);
	            System.out.println(i+1 + " - " + paciente);
	        }
		}
	}
}
