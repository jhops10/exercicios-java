package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura2D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

	private double lado;
	
	
	
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	@Override
	public String toString() {
		String s = "Quadrado: \n";
		s += "Área: " + this.calcularArea() + "\n";
		return s;                                   
	}

}
