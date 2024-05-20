package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Faça um programa para a leitura de duas notas parciais de um aluno.
		O programa deve calcular a média alcançada por aluno e apresentar:
		o A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		o A mensagem "Reprovado", se a média for menor do que sete;
		o A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2.0;
		
		if (media == 10.0) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();

	}

}
