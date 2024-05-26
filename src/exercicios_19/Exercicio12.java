package exercicios_19;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que defina e escreva a soma de todos os elementos armazenado neste vetor.*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[10];
		int somaTotal = 0;
		for(int i = 0; i < vectA.length; i++) {
			System.out.println("Digite um valor para o índice " + i + " do vetor:");
			vectA[i] = sc.nextInt();
			
			somaTotal += vectA[i];
		}
		
		System.out.println("A soma total do seu vetor é: " + somaTotal);
		sc.close();

	}

}
