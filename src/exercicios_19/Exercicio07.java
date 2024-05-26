package exercicios_19;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
		um vetor C, onde cada elemento de C é a subtração dos respectivos
		elementos em A e B, ou seja:
		C[i] = A[i] – B[i].*/
		
		Scanner sc = new Scanner(System.in);
	
		int[] vectA = new int[10];
		int[] vectB = new int[10];
		int[] vectC = new int[10];
		
		for(int i = 0; i  < vectA.length; i++) {
			System.out.println("Digite um valor para o Vector A no índice " + i + ":" );
			vectA[i] = sc.nextInt();
			System.out.println("Digite um valor para o Vector B no índice " + i + ":");
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] - vectB[i];
		}
		
		System.out.println("VECT A: ");
		for(int num : vectA) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("VECT B: ");
		for(int num : vectB) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("VECT C: ");
		for(int num : vectC) {
			System.out.print(num + " ");
		}
		
		sc.close();

	}

}
