package exercicios_20;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um programa para armazenar em uma matriz os
		compromissos de uma agenda pessoal. Cada dia do mês deve
		conter 24 horas, onde para cada uma destas 24 horas podemos
		associar um tarefa específica (compromisso agendado). O
		programa deve ter um menu onde o usuário indica o dia do mês
		que deseja alterar e a hora, entrando em seguida com o
		compromisso, ou então, o usuário pode também consultar a
		agenda, fornecendo o dia e a hora para obter o
		compromisso armazenado.*/
		
		Scanner sc = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		boolean sair = false;
		int opcao;
		
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = sc.nextInt();
			
			if(opcao == 1) { //adicionar compromisso
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = sc.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia válido.");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while(!horaValido) {
					System.out.println("Entre com a hora do compromisso:");
					hora = sc.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Digite uma hora válida.");
					}
				}

				
				System.out.println("Digite o compromisso");
				compromissos[--dia][hora] = sc.next();
				
			} else if (opcao == 2) { //verificar compromisso
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês:");
					dia = sc.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia válido.");
					}
				}
				
				boolean horaValido = false;
				int hora = 0;
				while(!horaValido) {
					System.out.println("Entre com a hora do compromisso:");
					hora = sc.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Digite uma hora válida.");
					}
				}
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[dia][hora]);
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção Inválida. Digite novamente.");
			}
		}
		sc.close();

	}

}
