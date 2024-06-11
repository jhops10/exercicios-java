package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.Figura3D;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoSuperficial;
import exercicios_44_a_46.exercicio01.interfaces.DimensaoVolumetrica;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {
	
	private double raio;
	private double altura;
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	@Override
	public double calcularVolume() {
		double PI = 3.14;
		double volume = PI * Math.pow(raio, 2) * altura;
		return volume;
	}

	@Override
	public double calcularArea() {
		double PI = 3.14;
		double areaTotal = (2 * PI * Math.pow(raio, 2) + (2 * PI * raio * altura));
		return areaTotal;
	}

}
