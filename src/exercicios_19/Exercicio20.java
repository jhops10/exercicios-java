package exercicios_19;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*Implementar um programa que obtenha a cotação do dólar (U$) em
		relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
		A[i] = cotação do dolar * i, para todo i variando de 1 até 20.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a Cotação do Dólar: ");
		cotacao = sc.nextDouble();
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}
		
		for(double cot : vetorA) {
			System.out.println(cot);
		}
		sc.close();
		

	}

}
