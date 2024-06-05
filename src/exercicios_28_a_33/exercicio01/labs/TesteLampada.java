package exercicios_28_a_33.exercicio01.labs;

import exercicios_28_a_33.exercicio01.Lampada;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada("Comum", "127W", "Amarela");
		
		lampada.ligar();
		lampada.desligar();
	}

}
