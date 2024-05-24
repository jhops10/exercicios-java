package exercicios_19;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		ser o quadrado do respectivo elemento de A, ou seja:
		B[i] = A[i] * A[I].*/
		
		Scanner sc = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor para o índice " + i + ":");
			vetorA[i] = sc.nextInt();
			vetorB[i] = (vetorA[i] * vetorA[i]);
		}
		
		System.out.println("VETOR A:");
		for(int item : vetorA) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		System.out.println("----------------------------");
		
		System.out.println("VETOR B:");
		for(int item : vetorB) {
			System.out.print(item + " ");
		}
		sc.close();

	}

}
