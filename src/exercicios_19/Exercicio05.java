package exercicios_19;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
		mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		ser o respectivo elemento de A multiplicado por sua posição (ou
		índice), ou seja:
		B[i] = A[i] * i.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de elementos que você deseja no array: ");
		int num = sc.nextInt();
		
		int[] vectA = new int[num];
		int[] vectB = new int[num];
		
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = i + 1;
			vectB[i] = (vectA[i] * i);
		}
		
		System.out.println("VECT A:");
		for(int item : vectA) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		System.out.println("VECT B:");
		for(int item: vectB) {
			System.out.print(item + " ");
		}
		
		
		sc.close();

	}

}
