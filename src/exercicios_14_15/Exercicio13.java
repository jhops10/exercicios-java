package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*Faça um programa que lê as duas notas parciais obtidas por um aluno
		numa disciplina ao longo de um semestre, e calcule a sua média. A
		atribuição de conceitos obedece à tabela abaixo:*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Entre com a nota 2: ");
		double nota2 = sc.nextDouble();
		double media =  (nota1 + nota2) / 2;
		String status;
		char conceito;
		
		
		if (media >= 9.0) {
			conceito = 'A';
			status = "APROVADO";
		} else if (media >= 7.5) {
			conceito = 'B';
			status = "APROVADO";
		} else if (media >= 6.0) {
			conceito = 'C';
			status = "APROVADO";
		} else if (media >= 4.0) {
			conceito = 'D';
			status = "REPROVADO";
		} else {
			conceito = 'E';
			status = "REPROVADO";
		}
		
		System.out.println("BOLETIM:");
		System.out.println("NOTA 1: " + nota1);
		System.out.println("NOTA 2: " + nota2);
		System.out.printf("MÉDIA: %.1f (CONCEITO: %s)%n", media, conceito);
		System.out.println("VOCÊ FOI " + status + "!!!");
		sc.close();

	}

}
