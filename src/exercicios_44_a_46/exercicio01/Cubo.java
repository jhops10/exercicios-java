package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura3D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoVolumetrica;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

	private double lado;
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		double volume = Math.pow(lado, 3);
		return volume;
	}

	@Override
	public double calcularArea() {
		double area = (lado * lado) * 6;
		return area;
	}

}
