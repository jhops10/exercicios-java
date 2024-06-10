package exercicios_37_a_43.exercicio01;

public class Teste {

	public static void main(String[] args) {
		
		
		System.out.println("*** Teste Conta Bancária ***");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Cliente Conta Simples");
		contaSimples.setNumConta("123456");
		System.out.println(contaSimples);
		
		
		System.out.println("*** Teste Poupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Simples");
		contaPoupanca.setNumConta("67891011");
		contaPoupanca.setDiaRendimento(20);
		System.out.println(contaPoupanca);
		
		
	System.out.println("*** Teste Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Cliente Conta Simples");
		contaEspecial.setNumConta("1213141516");

		System.out.println(contaEspecial);
		
		
		

	}
	

}
