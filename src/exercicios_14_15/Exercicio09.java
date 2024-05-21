package exercicios_14_15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*Faça um Programa que leia três números e mostre-os em ordem decrescente.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int n2 = sc.nextInt();
		System.out.println("Digite mais um número: ");
		int n3 = sc.nextInt();
		
		int maior,meio,menor;
		
		if (n1 > n2 && n1 > n3) {
			maior = n1;
			if (n2 > n3) {
				meio = n2;
				menor = n3;
			} else {
				meio = n3;
				menor = n2;
			}
		} else if(n2 > n1 && n2 > n3) {
			maior = n2;
			if (n1 > n3) {
				meio = n1;
				menor = n3;
			} else {
				meio = n3;
				menor = n1;
			}
		} else {
			maior = n3;
			if (n1 > n2) {
				meio = n1;
				menor = n2;
			} else {
				meio = n2;
				menor = n1;
			}
		}
			
		System.out.println("Números em ordem decrescente: ");
		System.out.println(maior);
		System.out.println(meio);
		System.out.println(menor);
		sc.close();

	}

}
