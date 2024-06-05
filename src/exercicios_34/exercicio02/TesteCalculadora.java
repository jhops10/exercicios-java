package exercicios_34.exercicio02;

import java.util.Locale;

public class TesteCalculadora {
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Soma:");
		imprimirTela(Calculadora.somar(2.0, 2.0));
		System.out.println("=====================");
		System.out.println("Subtração:");
		imprimirTela(Calculadora.subtrair(5.0, 2.0));
		System.out.println("=====================");
		System.out.println("Dividir:");
		imprimirTela(Calculadora.dividir(10, 4));
		System.out.println("=====================");
		System.out.println("Multiplicar:");
		imprimirTela(Calculadora.multiplicar(3, 5.0));
		System.out.println("=====================");
		System.out.println("Potência:");
		imprimirTela(Calculadora.potencia(2, 5));
		System.out.println("=====================");
		System.out.println("Fatorial");
		imprimirTela(Calculadora.fatorial(6));
		System.out.println("=====================");

	}

}
