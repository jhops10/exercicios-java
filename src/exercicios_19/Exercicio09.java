package exercicios_19;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
		um vetor C, onde cada elemento de C é a divisão dos respectivos
		elementos em A e B, ou seja:C[i] = A[i] / float(B[i]).*/
		
		Scanner sc = new Scanner(System.in);
		

		int[] vectA = new int[10];
		int[] vectB = new int[10];
		int[] vectC = new int[10];
		
		for(int i = 0; i < vectA.length; i++) {
			System.out.println("Digite um valor para o indice " + i + " do Vetor A:");
			vectA[i] = sc.nextInt();
			System.out.println("Digite um valor para o indice " + i + " do Vetor B:");
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] / vectB[i];
		}
		
		System.out.println("VECT A x VECT B");
		System.out.println("VECT C:");
		for(int item : vectC) {
			System.out.print(item + " ");
		}
		sc.close();
		

	}

}
