package exercicios_34.exercicio02;

public class Calculadora {

	public static double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public static double subtrair(double n1, double n2) {
		if (n1 > n2) {
			return n1 - n2;
		} else {
			return n2 - n1;
		}
	}
	
	public static double multiplicar(double n1, double n2) {
		return n1 * n2;
	}
	
	public static double dividir(double n1, double n2) {
		return n1 / n2;
	}
	
	public static double potencia(double n1, int potencia) {
		return Math.pow(n1, potencia);
	}
	
	
	public static double fatorial(int num) {
		if (num == 0) {
			return 1;
		}
		
		int total = 1;
		for(int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}
	
}
