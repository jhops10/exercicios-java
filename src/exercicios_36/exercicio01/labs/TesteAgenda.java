package exercicios_36.exercicio01.labs;

import java.util.Scanner;

import exercicios_36.exercicio01.Agenda;
import exercicios_36.exercicio01.Contato;

public class TesteAgenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um nome para a sua agenda:");
		String nomeAgenda = sc.nextLine();
		
		Agenda agenda = new Agenda(nomeAgenda);
		
		int contato = 1;
		
		do {
			
			System.out.println("Entre os dados do contato #" + contato);
			System.out.println("Nome: ");
			String nomeContato = sc.next();
			System.out.println("Telefone: ");
			String telContato = sc.next();
			System.out.println("Email: ");
			String emailContato = sc.next();
			
			agenda.addContato(new Contato(nomeContato, telContato, emailContato));
			
			contato++;
			
		} while(contato <= 3);
		
		if(agenda != null) {
			System.out.println(agenda.obterInfo());
		}
		
		sc.close();

	}

}
