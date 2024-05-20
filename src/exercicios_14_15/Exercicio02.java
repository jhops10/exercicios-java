package exercicios_14_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Faça um Programa que peça um valor e mostre na tela se o valor é
		positivo ou negativo.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("O número digitado é NEGATIVO.");
		} else {
			System.out.println("O número digitado é POSITIVO.");
		}
		sc.close();
	}

}
