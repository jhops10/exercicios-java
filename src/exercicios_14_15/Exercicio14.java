package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*Faça um Programa que peça os 3 lados de um triângulo. O programa
		deverá informar se os valores podem ser um triângulo. Indique, caso
		os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
		escaleno.
		o Dicas:
		o Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
		o Triângulo Equilátero: três lados iguais;
		o Triângulo Isósceles: quaisquer dois lados iguais;
		o Triângulo Escaleno: três lados diferentes;*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor do LADO A: ");
		double ladoA = sc.nextDouble();
		System.out.println("Entre com o valor do LADO B: ");
		double ladoB = sc.nextDouble();
		System.out.println("Entre com o valor do LADO C: ");
		double ladoC = sc.nextDouble();
		
		boolean isTriangle;
		
		if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
			isTriangle = true;
		} else {
			isTriangle = false;
		}
		
		if (isTriangle) {
			if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
				System.out.println("Triângulo Equilátero");
			} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
			System.out.println("Não é possível formar um triângulo com os valores informados");
		}
		
		
		
		sc.close();

	}

}
