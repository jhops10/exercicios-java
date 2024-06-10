package exercicios_37_a_43.exercicio01;

public  class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = 0;
	}

	
	
	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public String getNumConta() {
		return numConta;
	}



	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean sacar(double valorSaque) {
		if (valorSaque <= saldo) {
			this.saldo -= valorSaque;
			return true;
		} else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
	public void depositar(double valorDeposito) {
		if (valorDeposito > 0) {
			System.out.println("Depósito efetuado com sucesso!");
			this.saldo += valorDeposito;
		} else {
			System.out.println("O valor do depósito deve ser maior do que 0.");
		}
	}



	@Override
	public String toString() {
		String s =  "[Conta Bancaria] ";
		s += "nomeCliente = " + nomeCliente + ", numConta = " + numConta + ", saldo = " + saldo + " ";
		return s;
	}
	
	
	
	
}
