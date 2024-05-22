package exercicios_14_15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
		1 "Telefonou para a vítima?"
		2. "Esteve no local do crime?"
		3. "Mora perto da vítima?"
		4. "Devia para a vítima?"
		5. "Já trabalhou com a vítima?" 
		O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
		Se a pessoa responder positivamente a 2 questões ela deve ser
		classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5
		como "Assassino". Caso contrário, ele será classificado como
		"Inocente".*/

		int classificacao = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Responda as perguntas com S ou N");
		System.out.println("Você telefonou para a vítima?");
		char resp1 = sc.next().charAt(0);
		if (resp1 == 's') {
			classificacao += 1;
		} 
		
		System.out.println("Esteve no local do crime?");
		char resp2 = sc.next().charAt(0);
		if (resp2 == 's') {
			classificacao += 1;
		} 
		
		System.out.println("Mora perto da vítima? ");
		char resp3 = sc.next().charAt(0);
		if (resp3 == 's') {
			classificacao += 1;
		} 
		
		System.out.println("Devia para vítima?");
		char resp4 = sc.next().charAt(0);
		if (resp4 == 's') {
			classificacao += 1;
		} 
		
		System.out.println("Já trabalhou com a vítima?");
		char resp5 = sc.next().charAt(0);
		if (resp5 == 's') {
			classificacao += 1;
		} 
		
		switch(classificacao) {
		case 2:
			System.out.println("SUSPEITA");
			break;
		case 3:
		case 4:
			System.out.println("CÚMPLICE");
			break;
		case 5:
			System.out.println("ASSASSINO");
			break;
		default:
			System.out.println("INOCENTE");
		}
	

		sc.close();
	}

}
