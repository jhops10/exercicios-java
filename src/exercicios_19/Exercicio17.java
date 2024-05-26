package exercicios_19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a quantidade de pessoas que possuem idade superior a 35 anos.*/
		
		Scanner sc = new Scanner(System.in);
		int[] idades = new int[10];
		int maiorQue35 = 0;
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade da pessoa do indice " + i + " do vetor");
			idades[i] = sc.nextInt();
			
			if (idades[i] > 35) {
				maiorQue35 += 1;
			}
		}
		
		System.out.println("O seu vetor possui " + maiorQue35 + " pessoas com mais de 35 anos.");
		sc.close();

	}

}
