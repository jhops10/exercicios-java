package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Faça um Programa que leia um número e exiba o dia correspondente
		da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		aparecer valor inválido.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número para saber o dia da semana (1-Domingo, 2- Segunda, etc.)");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("ERRO! Digite uma opção válida.");
			break;
		}
		sc.close();
	}

}
