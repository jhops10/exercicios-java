package exercicios_19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*Ler as duas notas bimestrais para um conjunto de 10 alunos.
		Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
		tipo real. Escreva um programa que calcule a média aritmética simples
		das notas informadas armazenando o resultado em um vetor “Result”
		de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situaçãode cada aluno. Se a média calculada for superior ou igual a 7 o aluno
		estará “aprovado”, caso contrário, a situação do aluno será
		“reprovado”.*/
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas1.length];
		
		for(int i = 0; i < notas1.length; i++) {
			System.out.println("Digite a Nota 1 do aluno do índice: " + i);
			notas1[i] = sc.nextDouble();
			System.out.println("Digite a Nota 2 do aluno do índice: " + i);
			notas2[i] = sc.nextDouble();
			result[i] = (notas1[i] + notas2[i]) / 2.0;
		}
		
		System.out.println("RESULTADO:");
		for(double notaAluno : result) {
			
			if(notaAluno >= 7) {
				System.out.print("APROVADO, ");
			} else {
				System.out.print("REPROVADO, ");
			}
		}
		
		sc.close();

	}

}
