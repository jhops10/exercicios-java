package exercicios_14_15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Faça um Programa que verifique se uma letra digitada é vogal ou consoante.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma letra para saber se ela é vogal ou consoante.");
		char letra = sc.next().charAt(0);
		char letraLowerCase = Character.toLowerCase(letra);
		
		switch(letraLowerCase) {
		case 'a':
			System.out.println("VOGAL");
			break;
		case 'e':
			System.out.println("VOGAL");
			break;
		case 'i':
			System.out.println("VOGAL");
			break;
		case 'o':
			System.out.println("VOGAL");
			break;
		case 'u':
			System.out.println("VOGAL");
			break;
		default: System.out.println("CONSOANTE");
			break;
		}
		
		sc.close();
	}

}
