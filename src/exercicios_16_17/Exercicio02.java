package exercicios_16_17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Faça um programa que leia um nome de usuário e a sua senha e não
		aceite a senha igual ao nome do usuário, mostrando uma mensagem
		de erro e voltando a pedir as informações.*/
		
		Scanner sc = new Scanner(System.in);
		String usuario, senha;
		
		do {
			System.out.println("Defina o seu nome de usuário: ");
			usuario = sc.next();
			System.out.println("Defina a sua senha: ");
			senha = sc.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha inválida, digite novamente");
			} else {
				System.out.println("Cadastro efetuado com sucesso!");
			}
			
		} while(usuario.equalsIgnoreCase(senha));
		
		sc.close();

	}

}
