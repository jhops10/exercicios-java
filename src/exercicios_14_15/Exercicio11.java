package exercicios_14_15;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*As Organizações Tabajara resolveram dar um aumento de salário aos
		seus colaboradores e lhe contraram para desenvolver o programa que
		calculará os reajustes.
		o Faça um programa que recebe o salário de um colaborador e o
		reajuste segundo o seguinte critério, baseado no salário atual:
		o salários até R$ 280,00 (incluindo) : aumento de 20%
		o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		o salários de R$ 1500,00 em diante : aumento de 5% 
		Após oaumento ser realizado, informe na tela:
		o o salário antes do reajuste;
		o o percentual de aumento aplicado;
		o o valor do aumento;
		o o novo salário, após o aumento.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o seu salário em $ para descobrir seu aumento.");
		double salario = sc.nextDouble();
		
		double aumento, novoSalario, reajuste;
		
		if (salario <= 280.0) {
			aumento = 20.0 / 100.0;
			reajuste = salario * aumento;
			novoSalario = salario + reajuste;
		} else if (salario <= 700.0) {
			aumento = 15.0 / 100;
			reajuste = salario * aumento;
			novoSalario = salario + reajuste;
		} else if(salario <= 1500.0) {
			aumento = 10.0 / 100.0;
			reajuste = salario * aumento;
			novoSalario = salario + reajuste;
		} else {
			aumento = 5.0 / 100;
			reajuste = salario * aumento;
			novoSalario = salario + reajuste;
		}
		
		System.out.printf("Salário Antigo: R$ %.2f%n", salario);
		System.out.printf("O seu reajuste foi de: %.0f%%%n", aumento * 100);
		System.out.printf("Valor do Aumento: R$ %.2f%n", reajuste);
		System.out.printf("Seu novo salário é: R$ %.2f%n", novoSalario);
		sc.close();

	}

}
