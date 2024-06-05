package exercicios_28_a_33.exercicio03;
	/*Escreva	uma	classe para	representar	um	Aluno.	Adicione	atributos	
	relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
	que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
	dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
	aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
	Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
	aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra	as	
	notas e	mostra	se	o	aluno	foi	aprovado	ou	não.*/

public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] disciplinas;
	private double[][] notasDisciplinas;
	
	public Aluno() {
		this.disciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}
	
	
	public Aluno(String nome, String matricula, String nomeCurso) {
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.disciplinas = new String[3];
		this.notasDisciplinas = new double[3][4];
	}

	
	


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}


	public String[] getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}


	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}


	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}


	public void mostrarInfo() {
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
	
	public void verificarAprovado(int indice) {
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
