package exercicios_37_a_43.exercicio03;

public class Mamifero extends Animal{
	private String alimento;
	
	public Mamifero() {
		super.setPatas(4);
		super.setAmbiente("Terra");
		this.alimento = "Mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Alimento: " + this.getAlimento();
		
		return s;
	}
	
	
	
}
