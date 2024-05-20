package exercicios_14_15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite F ou M - (F - Feminino, M - Masculino)");
		char sexo = sc.next().charAt(0);
		
		if (sexo == 'F' || sexo == 'f') {
			System.out.println("Feminino");
		} else if (sexo == 'M' || sexo == 'm') {
			System.out.println("Masculino");
		} else {
			System.out.println("Sexo Inválido.");
		}
		sc.close();

	}

}
