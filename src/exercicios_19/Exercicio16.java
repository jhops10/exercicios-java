package exercicios_19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Escrever um programa
		que calcule e escreva: 
		a) a soma de elementos armazenados neste vetor que são inferiores a 15; 
		b) a quantidade de elementos armazenados no vetor que são iguais a 15;
		c) a média dos elementos armazenados no vetor que são superiores a 15.*/
		
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		int somaMenores15 = 0;
		int qtdIgual15 = 0;
		int contadorMaior15 = 0;
		double somaMaior15 = 0;
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um valor para o indice " + i + " do vetor:");
			vect[i] = sc.nextInt();
			
			if (vect[i] == 15) {
				qtdIgual15 += 1;
			} else if (vect[i] < 15) {
				somaMenores15 += vect[i];
			} else {
				contadorMaior15 += 1;
				somaMaior15 += vect[i];
			}
		}
		
		System.out.print("Soma de elementos inferiores a 15: " + somaMenores15);
		System.out.println();
		System.out.print("Quantidade de elementos iguais a 15: " + qtdIgual15);
		System.out.println();
		System.out.print("Média dos elementos superiores a 15: " + (somaMaior15 / contadorMaior15));
		sc.close();

	}

}
