package exercicios_16_17;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um programa que imprima na tela os números de 1 a 20, um
		abaixo do outro. 
		Depois modifique o programa para que ele mostre os números um ao lado do outro.*/
		
		int num = 1;
		int max = 20;
		
		while(num <= max) {
			System.out.println(num);
			num += 1;
		}
		
		//Modificação: 
		System.out.println();
		System.out.println("MODIFICAÇÃO DO EXERCÍCIO: ");
		num = 1;
		
		while(num <= max) {
			System.out.print(num + " ");
			num += 1;
		}

	}

}
