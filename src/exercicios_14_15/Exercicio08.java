package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*Faça um programa que pergunte o preço de três produtos e informe
		qual produto você deve comprar, sabendo que a decisão é sempre
		pelo mais barato.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor em $ do primeiro produto: ");
		double prod1 = sc.nextDouble();
		System.out.println("Digite o valor em $ do segundo produto: ");
		double prod2 = sc.nextDouble();
		System.out.println("Digite o valor em $ do terceiro produto: ");
		double prod3 = sc.nextDouble();
		
		double maisBarato;
		
		if (prod1 < prod2 && prod1 < prod3) {
			maisBarato = prod1;
		} else if (prod2 < prod1 && prod2 < prod3) {
			maisBarato = prod2;
		} else {
			maisBarato = prod3;
		}
		
		System.out.printf("Você deve comprar o produto de valor $ %.2f", maisBarato);
		sc.close();
	}

}
