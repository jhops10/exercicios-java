package exercicios_44_a_46.exercicio01;

import exercicios_44_a_46.exercicio01.entities.FiguraGeometrica;

public class Teste {

	public static void main(String[] args) {

		Cilindro cilindro = new Cilindro();
		cilindro.setAltura(5.0);
		cilindro.setRaio(3.5);
		
		Circulo circulo = new Circulo();
		circulo.setRaio(5.0);
		
		Cubo cubo = new Cubo();
		cubo.setLado(3);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(6);
		
		Piramide piramide = new Piramide();
		piramide.setAltura(6.5);
		piramide.setBase(3);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(4.0);
		triangulo.setBase(2.1);
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = cilindro;
		figuras[1] = circulo;
		figuras[2] = cubo;
		figuras[3] = quadrado;
		figuras[4] = piramide;
		figuras[5] = triangulo;
		
		for(FiguraGeometrica figura : figuras) {
			System.out.println(figura.toString());
		}
		

	}

}
