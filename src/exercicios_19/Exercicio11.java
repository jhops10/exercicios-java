package exercicios_19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que defina e escreva a quantidade de elementos armazenados neste
		vetor que são pares.*/
		
		Scanner sc = new Scanner(System.in);
		int[] vectA = new int[10];
		int qtdPares = 0;
		
		for(int i = 0; i < vectA.length; i++) {
			System.out.println("Defina um valor para o indice " + i + " do vector A:");
			vectA[i] = sc.nextInt();
			
			if (vectA[i] % 2 == 0) {
				qtdPares += 1;
			}
		}
		
		System.out.println("No vetor contém: " + qtdPares + " números pares.");
		sc.close();

	}

}
