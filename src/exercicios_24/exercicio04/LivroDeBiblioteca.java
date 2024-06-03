package exercicios_24.exercicio04;

import java.util.Date;

public class LivroDeBiblioteca {
	/*Usando	o	resultado	do	modelo	“Livro”	como	base,	crie	uma classe
	“LivroDeBiblioteca”	que	represente	os	dados	básicos	de	um	livro	de	uma	
	biblioteca,	que	pode	ser	emprestado	a leitores.*/
	String titulo;
	String autor;
	String editora;
	int numeroPaginas;
	int anoLancamento;
	String isbn;
	
	boolean emprestado;
	Date dataEmprestimo;
	Date dataDevolucao;
	String responsavelPeloEmprestimo;
}
