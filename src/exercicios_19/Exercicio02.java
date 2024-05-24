package exercicios_19;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
		mesmo tipo e tamanho e com os elementos do vetor A multiplicados
		por 2, ou seja: B[i] = A[i] * 2.*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[8];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor para o indice " + i + ":");
			vetorA[i] = sc.nextInt();
			vetorB[i] = (vetorA[i] * 2);
		}
		
		System.out.println("VETOR A:");
		for(int item : vetorA) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		System.out.println("VETOR B:");
		for(int item: vetorB) {
			System.out.print(item + " ");
		}
		
		sc.close();

	}

}
