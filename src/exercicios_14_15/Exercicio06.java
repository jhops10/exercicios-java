package exercicios_14_15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um Programa que leia três números e mostre o maior deles.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número digitado foi: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número digitado foi: " + num2);
		} else {
			System.out.println("O maior número digitado foi: " + num3);
		}
		sc.close();

	}

}
