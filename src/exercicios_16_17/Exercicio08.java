package exercicios_16_17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*Faça um programa que leia 5 números e informe a soma e a média
		dos números.*/

		Scanner sc = new Scanner(System.in);
		int qtdNum = 5;
		int soma = 0;
		double media;
		
		for(int i = 0; i < qtdNum ; i++) {
			System.out.println("Digite um número: ");
			int num = sc.nextInt();
			
			soma += num;
		}
		
		media = soma / qtdNum;
		
		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println("A média dos números digitados é: " + media);
		sc.close();
	}

}
