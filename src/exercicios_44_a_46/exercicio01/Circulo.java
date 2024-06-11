package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura2D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;

public class Circulo extends Figura2D implements DimensaoSuperficial {

	private double raio;
	
	
	
	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}



	@Override
	public double calcularArea() {
		double PI = 3.14;
		double area = PI * (Math.pow(this.raio, 2));
		return area;
	}
	
	@Override
	public String toString() {
		String s = "Circulo: \n";
		s += "Área: " + this.calcularArea() + "\n";
		return s;                                   
	}

}
