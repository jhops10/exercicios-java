package exercicios_19;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
		0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
		para implementar um programa que determine o percentual de
		números 0's e 1's existentes no vetor A.*/
		
		Scanner sc = new Scanner(System.in);
		int[] vectorA = new int[10];
		int contadorZero = 0;
		int contadorOne = 0;
		
		
		for(int i = 0; i< vectorA.length; i++) {
			vectorA[i] = (int) Math.round(Math.random() * 1);
			
			if(vectorA[i] == 0) {
				contadorZero += 1;
			} else {
				contadorOne += 1;
			}

		}
		
		System.out.println("Porcentagem de números 0: " + ((contadorZero / 10.0) * 100) + "%");
		System.out.println("Porcentagem de números 1: " + ((contadorOne / 10.0) * 100) + "%");
		
		sc.close();
		
		

	}

}
