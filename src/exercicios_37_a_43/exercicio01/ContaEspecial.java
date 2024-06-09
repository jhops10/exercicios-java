package exercicios_37_a_43.exercicio01;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial(String nomeCliente, String numConta, double saldo) {
		super(nomeCliente, numConta, saldo);

	}
	
	public void sacar(double valorSaque) {
		if (valorSaque <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valorSaque);
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

}
