package exercicios_37_a_43.exercicio01;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);

	}
	
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	public boolean sacar(double valorSaque) {
		double saldoComLimite = this.getSaldo() + this.getLimite();
		
		if ((saldoComLimite - valorSaque) >= 0) {
			this.setSaldo(this.getSaldo() - valorSaque);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String s =  "[Conta Especial] ";
		s += "limite = " + limite + " ";
		s += super.toString();
		
		return s;
	}
	
	

}
