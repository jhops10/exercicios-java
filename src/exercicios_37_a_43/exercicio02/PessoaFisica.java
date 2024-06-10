package exercicios_37_a_43.exercicio02;

public class PessoaFisica extends Contribuinte{

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if (renda <= 1400.00) {
			return 0.0;
		} else if (renda <= 2100.00) {
			return renda * 0.1 - 100;
		} else if (renda <= 2800.00) {
			return renda * 0.15 - 270;
		} else if (renda <= 3600.00) {
			return renda * 0.25 - 500;
		} else {
			return renda * 0.30 - 700;
		}
		
	}

	@Override
	public String toString() {
		String s = "Pessoa Física \n";
		s += super.toString();
		s += " ;CPF: " + this.getCpf();
		s += " ;Imposto a ser pago: " + this.calcularImposto();
		return s;
	}
	
	
	
	
	
	
}
