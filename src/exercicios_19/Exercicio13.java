package exercicios_19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
		que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.*/
		
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		int somaMultiplosDe5 = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite o valor do índice " + i + " do vetor:");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 5 == 0) {
				somaMultiplosDe5 += vect[i];
			}
		}
		
		System.out.println("A soma dos elementos armazenados neste vetor que são múltiplos de 5 são: " + somaMultiplosDe5);
		sc.close();

	}

}
