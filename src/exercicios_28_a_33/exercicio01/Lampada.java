package exercicios_28_a_33.exercicio01;

	/*Escreva	uma classe para	representar	uma	lâmpada. Desenvolva	métodos	
	para	ligar,	desligar	a	lampada.*/

public class Lampada {
	private String modelo;
	private String tensao;
	private String cor;
	private boolean ligada;
	
	
	public Lampada() {
		
	}

	public Lampada(String modelo, String tensao, String cor) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.cor = cor;
		this.ligada = false;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isLigada() {
		return ligada;
	}

	
	public boolean ligar() {
		System.out.println("Lâmpada ON!");
		return this.ligada = true;
	}

	public boolean desligar() {
		System.out.println("Lâmpada OFF!");
		return this.ligada = false;
	}
	
	
	
	
	
	
	
}
