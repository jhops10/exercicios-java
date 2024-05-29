package exercicios_20;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Modifique o programa anterior de maneira a guardar os
		compromissos de todo o ano, organizados por mês, dia e hora
		(só 8 horas por dia).*/

		Scanner sc = new Scanner(System.in);
		
		String[][][] compromissos = new String[12][31][8];
		boolean sair = false;
		int opcao;
		
		while(!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = sc.nextInt();
			
			if(opcao == 1) { //adicionar compromisso
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido) {
					System.out.println("Entre com o mês do mês:");
					mes = sc.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Digite um mês válido.");
					}
				}
				
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
					if(hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Digite uma hora válida.");
					}
				}

				
				System.out.println("Digite o compromisso");
				compromissos[--mes][--dia][hora] = sc.next();
				
			} else if (opcao == 2) { //verificar compromisso
				boolean mesValido = false;
				int mes = 0;
				while(!mesValido) {
					System.out.println("Entre com o mês do mês:");
					mes = sc.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Digite um mês válido.");
					}
				}
				
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
				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção Inválida. Digite novamente.");
			}
		}
		sc.close();
	}

}
