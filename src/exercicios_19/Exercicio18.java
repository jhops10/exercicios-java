package exercicios_19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*Ler um vetor A com 10 elementos inteiros correspondentes as idades
		de um grupo de pessoas. Escreva um programa que determine e
		escreva a menor e a maior idades e suas respectivas posições.*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[10];
		int maiorIdade = 0;
		int indexMaiorIdade = 0;
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite a idade para o indice " + i + " do vetor");
			vect[i] = sc.nextInt();

			if (vect[i] > maiorIdade) {
				maiorIdade = vect[i];
				indexMaiorIdade = i;
			}
		}
		
		int menorIdade = maiorIdade;
		int indexMenorIdade = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < menorIdade) {
				menorIdade = vect[i];
				indexMenorIdade = i;
			}
		}
		
		System.out.println("A menor idade digitada foi: " + menorIdade + " e o índice do item é: " + indexMenorIdade);
		System.out.println("A maior idade digitada foi: " + maiorIdade + " e o índice do item é: " + indexMaiorIdade);
		sc.close();

	}

}
