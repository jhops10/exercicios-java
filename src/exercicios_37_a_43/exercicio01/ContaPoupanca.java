package exercicios_37_a_43.exercicio01;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	
	public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);

	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public double calcularNovoSaldo(int diaRendimento) {
		double novoSaldo = this.getSaldo() * diaRendimento;
		return novoSaldo;
	}
	

}
