package exercicios_16_17;

public class Exercicio09 {

	public static void main(String[] args) {
		/*Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.*/
		
		int qtdNumero = 50;
		
		for (int i = 1; i <= qtdNumero; i++) {
			if (i % 2 != 0) {
				System.out.println("Número: " + i);
			}
		}

	}

}
