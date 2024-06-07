package exercicios_36.exercicio02.labs;

import java.util.Scanner;

import exercicios_36.exercicio02.Aluno;
import exercicios_36.exercicio02.Curso;
import exercicios_36.exercicio02.Professor;

public class Teste {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso:");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o horário do curso:");
		String horario = sc.nextLine();
		
		System.out.println("Entre com o nome do professor");
		String nomeProf = sc.nextLine();
		
		System.out.println("Entre com o departamento do professor");
		String dep = sc.nextLine();
		
		System.out.println("Entre com o email do professor");
		String emailProf = sc.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(dep);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("==================================");
		
		Aluno[] alunos = new Aluno[5];
		
		for(int i = 0; i < 5; i++) {
			
			sc.nextLine();
			System.out.println("Entre com o nome do aluno #" + (i + 1));
			String nomeAluno = sc.nextLine();
			
			System.out.println("Entre com a matricula do aluno:");
			String matriculaAluno = sc.nextLine();
			
			double[] notas = new double[4];
			
			for(int j = 0; j < 4 ; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = sc.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());
		
		sc.close();

	}

}
