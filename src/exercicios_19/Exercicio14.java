package exercicios_19;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que defina e escreva a média aritmética simples dos elementos ímpares armazenados neste vetor.*/
		
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		int contadorImpares = 0;
		double somaImpares = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um valor para o indice " + i + " do vetor:");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 != 0) {
				contadorImpares += 1;
				somaImpares += vect[i];
			}
		}
		
		System.out.println("A média simples dos elementos ímpares armazenados neste vetor é: " + (somaImpares / contadorImpares));
		sc.close();

	}

}
