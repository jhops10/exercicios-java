package exercicios_14_15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Faça um Programa que leia três números e mostre o maior e o menor deles.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		System.out.println("Digite mais um número: ");
		int num3 = sc.nextInt();
		
		int maiorNumero, menorNumero;
		
		if (num1 > num2 && num1 > num3) {
			maiorNumero = num1;
		} else if (num2 > num1 && num2 > num3) {
			maiorNumero = num2;
		} else {
			maiorNumero = num3;
		}
		
		if (num1 < num2 && num1 < num3) {
			menorNumero = num1;
		} else if (num2 < num1 && num2 < num3) {
			menorNumero = num2;
		} else {
			menorNumero = num3;
		}
		
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);
		
		
		sc.close();

	}

}
