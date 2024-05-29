package exercicios_20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Capture do teclado valores para preenchimento de uma matriz M 3x3. 
		 Após a captura imprima a matriz criada e encontre a quantidade de números pares, 
		 a quantidade de números ímpares.*/
		
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[3][3];
		int qtdPar = 0;
		int qtdImpar = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j  < mat[i].length; j++) {
				System.out.println("Digite um valor para o valor (" + i + "," + j + ") da matriz.");
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] % 2 == 0) {
					qtdPar += 1;
				} else {
					qtdImpar += 1;
				}
			}	
		}
		
		System.out.println("----------------------------------");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
		System.out.println("QTD DE NÚMEROS PARES = " + qtdPar);
		System.out.println("QTD DE NÚMEROS ÍMPARES = " + qtdImpar);
		sc.close();

	}

}
