package exercicios_16_17;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Supondo que a população de um país A seja da ordem de 80000
		habitantes com uma taxa anual de crescimento de 3% e que a
		população de B seja 200000 habitantes com uma taxa de crescimento
		de 1.5%. Faça um programa que calcule e escreva o número de anos
		necessários para que a população do país A ultrapasse ou iguale a
		população do país B, mantidas as taxas de crescimento.*/
		
		int popA = 80000;
		int popB = 200000;
		int contador = 0;
		
		while(popA <= popB) {
			popA += popA * 0.03;
			popB += popB * 0.015;
			contador += 1;
		}
		
		System.out.println("Em " + contador + " anos, a população A vai ultrapassar ou igualar com a população B.");

	}

}
