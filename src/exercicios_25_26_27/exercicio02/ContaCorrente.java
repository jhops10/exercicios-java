package exercicios_25_26_27.exercicio02;

public class ContaCorrente {

	String agencia;
	String conta;
	double saldo;
	boolean especial;
	double limite;
	
	
	void depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		} else {
			System.out.println("ERRO! O valor de depósito deve ser maior que 0.");
		}
	}
	
	void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;	
		} else {
			System.out.println("ERRO! Saldo insuficiente.");
		}
	}
	
	double consultarSaldo() {
		return this.saldo;
	}
	
	boolean utilizandoChequeEspecial() {
		return especial;
	}
	
}
