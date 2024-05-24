package exercicios_19;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
		mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
		raiz quadrada do respectivo elemento de A, ou seja:
		B[i] = sqrt(A[i])*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o tamanho do seu vetor");
		int num = sc.nextInt();
		
		double[] vectA = new double[num];
		double[] vectB = new double[num];
		
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = i;
			vectB[i] = Math.sqrt(vectA[i]);
		}
		
		System.out.println("VECT A:");
		for(double item : vectA) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		System.out.println("-----------------------");
		
		System.out.println("VECT B:");
		for(double item : vectB) {
			System.out.printf("%.2f ", item);
		}
		sc.close();

	}

}
