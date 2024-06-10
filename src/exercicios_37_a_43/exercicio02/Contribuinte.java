package exercicios_37_a_43.exercicio02;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	
	public Contribuinte() {
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	
	public abstract double calcularImposto();
	
	@Override
	public String toString() {
		String s = "Nome: " + this.getNome();
		s += " ;Renda Bruta" + this.getRendaBruta();
		
		return s;
	}
	


}
