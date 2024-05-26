package exercicios_19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
		que defina o percentual de elementos pares e ímpares,
		respectivamente, armazenados neste vetor.*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[10];
		int contadorImpar = 0; 
		int	contadorPar = 0;
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite um valor para o indice " + i + " do vetor:");
			vect[i] = sc.nextInt();
			
			if(vect[i] % 2 == 0) {
				contadorPar += 1;
			} else {
				contadorImpar += 1;
			}
		}
		double porcentagemImpar = (contadorImpar /10.0) * 100;
		double porcentagemPar = (contadorPar /10.0) * 100;
		
		System.out.println("Porcentagem de números pares: " + porcentagemPar + "%");
		System.out.println("Porcentagem de números ímpares: " + porcentagemImpar + "%");
		sc.close();

	}

}
