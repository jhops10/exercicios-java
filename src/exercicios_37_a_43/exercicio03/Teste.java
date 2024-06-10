package exercicios_37_a_43.exercicio03;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setPatas(4);
		camelo.setComprimento("150");;
		camelo.setAmbiente("Terra");
		camelo.setCor("Amarelo");
		camelo.setVelocidade(2.0);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento("300");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristicas("Barbatanas e Cauda");
		
		Mamifero ursoCanada = new Mamifero();
		ursoCanada.setNome("Urso-do-Canadá");
		ursoCanada.setComprimento("180");
		ursoCanada.setCor("Vermelho");
		ursoCanada.setVelocidade(0.5);
		ursoCanada.setAlimento("Mel");
		
		Animal[] animais = new Animal[3];
		
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = ursoCanada;
		
		System.out.println("Zoo");
		System.out.println("-----------------------------");
		for(Animal animal: animais) {
			System.out.println(animal.toString());
			System.out.println("-----------------------------");
		}

	}

}
