package exercicios_19;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
		mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
		seja, B[i] = A[i].*/
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] A = new int[5];
		int[] B = new int[5];
		
		for(int i = 0; i < A.length; i++) {
			System.out.println("Digite o valor da posição " + i + ":");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		
		for(int num : A) {
			System.out.println("Itens do Array A: " + num);
		}
		System.out.println("---------------------------------------");
		for(int num : B) {
			System.out.println("Itens do Array B: " + num);
		}
		
		sc.close();

	}

}
