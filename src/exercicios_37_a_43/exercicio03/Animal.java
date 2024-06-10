package exercicios_37_a_43.exercicio03;

public class Animal {
	private String nome;
	private String comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getComprimento() {
		return comprimento;
	}
	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String s = "Animal: " + this.getNome() + "\n";
		s += "Comprimento: " + this.getComprimento() + "cm \n";
		s += "Patas: " + this.getPatas() + "\n";
		s += "Cor: " + this.getCor() + "\n";
		s += "Ambiente: " + this.getAmbiente() + "\n";
		s += "Velocidade: " + this.getVelocidade() + "m/s \n";
		
		return s;
		
	}
	
	
	
}
