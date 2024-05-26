package exercicios_19;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		ser o resto da divisão do respectivo elemento de A por 2 (dois), ou
		seja: B[i] := A[i] % 2.*/

		Scanner sc = new Scanner(System.in);
		
		int[] vectA = new int[10];
		int[] vectB = new int[10];
		
		for(int i = 0; i < vectA.length; i++) {
			System.out.println("Digite um valor para o índice " + i + " do Vector A:");
			vectA[i] = sc.nextInt();
			vectB[i] = vectA[i] % 2;
		}
		
		System.out.println("VECT B:");
		for(int item : vectB) {
			System.out.print(item + " ");
		}
		sc.close();
	}

}
