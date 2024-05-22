package exercicios_16_17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
		qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
		numero ele deseja ver a tabuada. A saída deve ser conforme o
		exemplo abaixo:*/
		
		Scanner sc = new Scanner(System.in);
		int tabuada;
		boolean valid = false;
		
		do {
			System.out.println("Entre com o número de 1 a 10 para gerar a tabuada: ");
			tabuada = sc.nextInt(); 
			
			if (tabuada == 0 || tabuada > 10) {
				System.out.println("Você deve informar um número de 1 a 10");
			} else {
				valid = true;
			}
			
		} while (!valid);
		
		System.out.println("TABUADA DO " + tabuada);
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		
		
		sc.close();

	}

}
