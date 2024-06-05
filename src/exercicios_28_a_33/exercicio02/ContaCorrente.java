package exercicios_28_a_33.exercicio02;

	/*Cria	uma	classe	para	representar	uma	conta	corrente	que	possui	um	
	número,	um	saldo,	um	status	que	informa	se	ela	é	especial	ou	não, um	
	limite. Desenvolva	métodos	para	realizar	saque	(verificando	se	o	cliente	
	pode	realizar	saques),	despositar	dinheiro,	consultar	saldo	e	verificar	se	o	
	cliente	está	usando	cheque	especial	ou	não.	Desenvolva	um	programa	
	para	testar	essa	classe.*/

public class ContaCorrente {
	private String titular;
	private String conta;
	private String agencia;
	private double saldo;
	private boolean especial;
	
	public ContaCorrente() {
		
	}

	public ContaCorrente(String titular, String conta, String agencia, boolean especial) {
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = 0;
		this.especial = especial;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}


	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	public void depositar(double valorDeposito) {
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
		} else {
			System.out.println("ERRO! O valor do depósito deve ser maior do que 0.");
		}
	}
	
	public void sacar(double valorSaque) {
		if(valorSaque <= this.saldo) {
			this.saldo -= valorSaque;
		} else {
			System.out.println("ERRO! Saldo Insuficiente.");
		}
	}
	
	public void status(ContaCorrente conta) {
		System.out.println("======================");
		System.out.print("Titular: " + this.getTitular() + "\n");
		System.out.print("Conta: " + this.getConta() + "\n");
		System.out.print("Agência: " + this.getAgencia() + "\n");
		System.out.print("Saldo: R$" + this.getSaldo() + "\n");
		System.out.println("Limite Especial: " + this.isEspecial());
		System.out.println("======================");
	}
	
	
	
	
}
