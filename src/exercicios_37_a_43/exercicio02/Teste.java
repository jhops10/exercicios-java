package exercicios_37_a_43.exercicio02;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000.00);
		p1.setCpf("31072316650");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000.00);
		p2.setCpnj("99846425000183");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000.00);
		p3.setCpf("25285418305");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000.00);
		p4.setCpnj("41194610000150");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700.00);
		p5.setCpf("41628692510");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 04");
		p6.setRendaBruta(6000.00);
		p6.setCpnj("88704729000190");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		

	}

}
