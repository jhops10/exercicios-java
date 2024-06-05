package exercicios_28_a_33.exercicio02.labs;

import java.util.Locale;

import exercicios_28_a_33.exercicio02.ContaCorrente;

public class TesteContaCorrente {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		ContaCorrente conta = new ContaCorrente("João Paulo Moura", "17951-5", "4568-9", true);
		
		conta.depositar(3000.00);
		conta.status(conta);

	}

}
