package exercicios_25_26_27.exercicio03;

public class Aluno {
	String nome;
	String matricula;
	String nomeCurso;
	String[] disciplinas;
	double[][] notasDisciplinas;
	
	void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome do Curso: " + nomeCurso);
		
		for(int i = 0; i < notasDisciplinas.length; i++) {
			System.out.println("Notas da disciplina: " + disciplinas[i]);
			for(int j = 0 ; j < notasDisciplinas[i].length; j++) {
				System.out.print(notasDisciplinas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void verificarAprovado(int indice) {
		double sum = 0.0;
		for(int i = 0; i <notasDisciplinas[indice].length; i++) {
			sum += notasDisciplinas[indice][i];
		}
		double avg = sum / 4.0;
		
		if (avg >= 7.0) {
			System.out.println("APROVADO NA MATERIA " + indice);
		} else {
			System.out.println("REPROVADO NA MATERIA " + indice);
		}
	}
}
