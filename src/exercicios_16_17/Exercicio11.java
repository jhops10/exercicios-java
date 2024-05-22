package exercicios_16_17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*Altere o programa anterior para mostrar no final a soma dos números.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = sc.nextInt();
		int somaTotal = 0;
		
		if (num1 < num2) {
			
			for(int i = num1; i < num2; i++) {
				somaTotal += i;
				System.out.print(i + " ");
			} 
			
		} else {
			
			for(int i = num2; i < num1; i++) {
				somaTotal += i;
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		System.out.println("SOMA TOTAL DO INTERVALO DE NUMEROS: " + somaTotal);
		
		sc.close();

	}

}
