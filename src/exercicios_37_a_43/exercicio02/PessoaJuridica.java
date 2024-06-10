package exercicios_37_a_43.exercicio02;

public class PessoaJuridica extends Contribuinte{
	private String cpnj;

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}

	@Override
	public double calcularImposto() {
		double impostoTotal = this.getRendaBruta() * 0.1;
		return impostoTotal;
		
	}
	
	@Override
	public String toString() {
		String s = "Pessoa Jurídica \n";
		s += super.toString();
		s += " ;CNPJ: " + this.getCpnj();
		s += " ;Imposto a ser pago: " + this.calcularImposto();
		return s;
	}
	
}
