package exercicios_16_17;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Faça um programa que leia e valide as seguintes informações:
		a. Nome: maior que 3 caracteres;
		b. Idade: entre 0 e 150;
		c. Salário: maior que zero;
		d. Sexo: 'f' ou 'm';
		e. Estado Civil: 's', 'c', 'v', 'd';*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		boolean infoValida = false;
		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;
		
		
		//Validando o campo nome
		do {
			System.out.println("Entre com o seu nome:");
			nome = sc.next();
			
			if (nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("ERRO! O seu nome deve ter no mínimo 3 caracteres.");
			}
		} while(!infoValida);
		
		
		infoValida = false;
		
		
		//Validando o campo idade
		do {
			System.out.println("Entre com a sua idade: ");
			idade = sc.nextInt();
			
			if (idade > 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("ERRO! A sua idade deve estar entre 0 e 150.");
			}
		} while(!infoValida);
		
		
		infoValida = false;
		
		
		//Validando o campo salario
		do {
			System.out.println("Entre com o seu salário: ");
			salario = sc.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("ERRO! O seu salario deve ser maior do que 0.");
			}
		} while(!infoValida);
		
		
		infoValida = false;
		
		
		//Validando o campo sexo
		do {
			System.out.println("Entre com o seu sexo (M - Masculino e F - Feminino): ");
			sexo = sc.next().charAt(0);
			
			if (sexo == 'm' || sexo == 'f') {
				infoValida = true;
			} else {
				System.out.println("ERRO! Você deve preencher esse campo com F ou M");
			}
		} while(!infoValida);
		
		
		infoValida = false;
		
		
		//Validando o campo estado civil
		do {
			System.out.println("Entre com o seu estado civil (c,s,v,d): ");
			estadoCivil = sc.next().charAt(0);
			
			switch(estadoCivil) {
			case 'c':
			case 's':
			case 'v':
			case 'd':
				infoValida = true;
				break;
			default:
				System.out.println("ERRO! Você deve preencher esse campo corretamente");
				break;
			}
		} while(!infoValida);
		
		System.out.println("NOME: " + nome);
		System.out.println("IDADE: " + idade);
		System.out.println("SALARIO: " + salario);
		System.out.println("GÊNERO: " + sexo);
		System.out.println("ESTADO CIVIL: " + estadoCivil);
		sc.close();
		

	}

}
