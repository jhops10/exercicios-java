package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura3D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoVolumetrica;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
	
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
	public double calcularVolume() {
		double areaBase = base * base;
		double volume = areaBase * altura;
		return volume;
	}

	@Override
	public double calcularArea() {
		double area = (((base * altura) / 2) * 3);
		return area;
	}

}
