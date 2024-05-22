package exercicios_16_17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Altere o programa anterior permitindo ao usuário informar as
		populações e as taxas de crescimento iniciais. Valide a entrada e
		permita repetir a operação*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int popA;
		double crescimentoA;
		int popB;
		double crescimentoB;
		int contador = 0;
		boolean infoValida = false;
		
		do {
			System.out.println("Digite a qtd de habitantes da POPULAÇÃO A: ");
			popA = sc.nextInt();
			System.out.println("Digite a taxa de crescimento da POPULAÇÃO A:");
			crescimentoA = sc.nextDouble();
			
			if (popA > 0 && crescimentoA > 0) {
				infoValida = true;
			} else {
				System.out.println("ERRO! Digite um valor válido para a População e/ou Taxa de Crescimento");
			}
		} while(!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Digite a qtd de habitantes da POPULAÇÃO B: ");
			popB = sc.nextInt();
			
			System.out.println("Digite a taxa de crescimento da POPULAÇÃO B:");
			crescimentoB = sc.nextDouble();
			
			if (popB > 0 && crescimentoB > 0) {
				infoValida = true;
			} else { 
				System.out.println("ERRO! Digite um valor válido para a População e/ou Taxa de Crescimento");
			}
		} while(!infoValida);

		
		while(popA <= popB) {
			popA += popA * (crescimentoA / 100);
			popB += popB * (crescimentoB / 100);
			contador += 1;
		} 
		
		
		System.out.println("Em " + contador + " anos, a população A vai ultrapassar ou igualar com a população B.");
		sc.close();
		
		
	}

}
