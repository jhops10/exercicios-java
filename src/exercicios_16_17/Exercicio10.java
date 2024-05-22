package exercicios_16_17;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Faça um programa que receba dois números inteiros e gere os
		números inteiros que estão no intervalo compreendido por eles.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		
		if (num1 < num2) {
			
			for(int i = num1; i < num2; i++) {
				System.out.print(i + " ");
			} 
			
		} else {
			
			for(int i = num2; i < num1; i++) {
				System.out.print(i + " ");
			}
			
		}
		
		sc.close();

	}

}
