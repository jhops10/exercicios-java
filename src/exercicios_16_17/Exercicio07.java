package exercicios_16_17;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Faça um programa que leia 5 números e informe o maior número.*/

		Scanner sc = new Scanner(System.in);
		int qtdNum = 5;
		int maiorNum  = 0;
		
		for(int i = 0; i < qtdNum; i++) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
			}
		}
		
		System.out.println("O maior número digitado foi: " + maiorNum);
		sc.close();

	}

}
