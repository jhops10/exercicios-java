package exercicios_16_17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma
		mensagem caso o valor seja inválido e continue pedindo até que o
		usuário informe um valor válido.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double nota;
		
		do {
			System.out.println("Digite o valor da nota de 1 a 10");
			nota = sc.nextDouble();
		} while(nota < 0 || nota > 10);
		

		sc.close();

	}

}
