package exercicios_14_15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Faça um Programa que pergunte em que turno você estuda. Peça
		para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
		mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
		Inválido!", conforme o caso.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Em qual turno você estuda?");
		System.out.println("Digite M - Matutino, V - Vespertino e N - Noturno.");
		char turno = sc.next().charAt(0);
		char turnoLowerCase = Character.toLowerCase(turno);
		
		switch(turnoLowerCase) {
		case 'm':
			System.out.println("Bom Dia");
			break;
		case 'v':
			System.out.println("Boa Tarde");
			break;
		case 'n':
			System.out.println("Boa Noite");
			break;
		default:
				System.out.println("Opção Inválida");
				break;
				
		}
		sc.close();
	}

}
