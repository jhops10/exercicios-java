package exercicios_14_15;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*Faça um Programa que peça uma data no formato dd/mm/aaaa e
		determine se a mesma é uma data válida.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma data no formato dd/mm/aaa");
		System.out.println("Entre com o dia: ");
		int dia = sc.nextInt();
		
		if (dia > 31 || dia <= 0) {
			System.out.println("Preencha o campo DIA corretamente (valores de 1 a 31).");
		} else {
			System.out.println("Entre com o mês: ");
			int mes = sc.nextInt();
			
			if (mes > 12 || dia <= 0) {
				System.out.println("Preencha o campo MÊS corretamente (valores de 1 a 12).");
			} else {
				System.out.println("Entre com o ano: ");		
				int ano = sc.nextInt();
				if (ano > 0) {
					System.out.println("Data Digitada: " + dia + "/" + mes + "/" + ano);					
				} else {
					System.out.println("Preencha o campo ANO corretamente (valores maior que 0)");
				}
			}
		}
		

		sc.close();

	}

}
