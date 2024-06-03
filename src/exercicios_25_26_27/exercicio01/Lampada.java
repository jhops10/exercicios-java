package exercicios_25_26_27.exercicio01;

public class Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	Integer garantia;
	int GarantiaMeses;
	String[] tipos;
	boolean ligada;
	
	void ligar() {
		this.ligada = true;
	}
	
	void desligar() {
		this.ligada = false;
	}
	
	
}
