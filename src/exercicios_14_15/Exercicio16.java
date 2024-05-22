package exercicios_14_15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		/*Faça um Programa que peça um número correspondente a um
		determinado ano e em seguida informe se este ano é ou não bissexto.*/
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano para saber se é um ano bissexto: ");
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " NÃO é bissexto.");
		}
		sc.close();
	}

}
