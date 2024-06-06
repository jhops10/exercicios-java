package exercicios_36.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nome;
	private List<Contato> contatos = new ArrayList<>();
	

	
	public Agenda(String nome) {
		this.nome = nome;
	}

	public Agenda() {
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void addContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	public String obterInfo() {
		String info = "Nome da Agenda: " + nome + "\n";
		
		if (contatos != null) {
			for(Contato c : contatos) {
				info += c.obterInfo() + " \n";
			}
		}
		
		return info;
		
	}

	

	
	
	
}
