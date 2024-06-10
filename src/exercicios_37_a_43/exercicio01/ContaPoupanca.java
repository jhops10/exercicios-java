package exercicios_37_a_43.exercicio01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private double diaRendimento;
	
	public ContaPoupanca() {
		
	}
	
	public ContaPoupanca(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);

	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		
		return false;
	}
	

	@Override
	public String toString() {
		String s = "[Conta Especial] ";
		s += "diaRendimento = " + diaRendimento + ", ";
		s += super.toString();
		
		return s;
	}


	
	

}
