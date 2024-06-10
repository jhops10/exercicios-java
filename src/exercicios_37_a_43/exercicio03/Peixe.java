package exercicios_37_a_43.exercicio03;

public class Peixe extends Animal{
	private String caracteristicas;
	
	public Peixe() {
		super.setPatas(0);
		super.setAmbiente("Mar");
		super.setCor("Cinzento");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Caracteristicas: " + this.getCaracteristicas();
		
		return s;
	}
	
	
}
