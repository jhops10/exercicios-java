package exercicios_14_15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/* Faça um Programa que peça dois números e imprima o maior deles.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("Maior número: " + num1);
		} else if (num1 < num2) {
			System.out.println("Maior número: " + num2);
		} else {
			System.out.println("Os números são iguais.");
		}
		
		
		sc.close();

	}

}
