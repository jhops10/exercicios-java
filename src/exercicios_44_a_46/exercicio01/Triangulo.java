package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura2D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

	private double base;
	private double altura;
	
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		double area = (base * altura) / 2;
		return area;
	}
	
	@Override
	public String toString() {
		String s = "Triângulo: \n";
		s += "Área: " + this.calcularArea() + "\n";
		return s;                                   
	}

}
