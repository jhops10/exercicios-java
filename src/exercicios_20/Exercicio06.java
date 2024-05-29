package exercicios_20;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um programa para jogar o jogo da velha. O programa deve
		permitir que dois jogadores façam uma partida do jogo da velha,
		usando o computador para ver o tabuleiro. Cada jogador vai
		alternadamente informando a posição onde deseja colocar a sua
		peça (‘O’ ou ‘X’). O programa deve impedir jogadas inválidas e
		determinar automaticamente quando o jogo terminou e quem foi o
		vencedor (jogador1 ou jogador2). A cada nova jogada, o programa
		deve atualizar a situação do tabuleiro na tela.*/
		
		Scanner sc = new Scanner(System.in);
		
		char[][] jogoDaVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		
		while(!ganhou) {
			if(jogada % 2 == 1) {//Jogadar 1
				System.out.println("Vez do Jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {
				System.out.println("Vez do Jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a linha (1, 2 ou 3)");
				linha = sc.nextInt();
				if (linha  >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada Inválida, tente novamente.");
				}	
			}
			
			boolean colunaValida = false;

			while(!colunaValida) {
				System.out.println("Entre com a coluna (1,2 ou 3)");
				coluna = sc.nextInt();
				if (coluna  >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada Inválida, tente novamente.");
				}	
			} 
			
			linha--;
			coluna--;
			if(jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Posição já usada, tente novamente.");
			} else {
				jogoDaVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			//Imprimir Tabuleiro
			for(int i = 0; i < jogoDaVelha.length; i++) {
				for(int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
				}
				System.out.println();
			}
			
			//Verifica se há Vencedor
			if(( jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||
					( jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || 
					( jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
					( jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
					( jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
					( jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
					( jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X')){
				ganhou = true;
				System.out.println("PARABÉNS!! Jogador 1 Ganhou!!");
			} else if(( jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
					( jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || 
					( jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
					( jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
					( jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
					( jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
					( jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O')){
				ganhou = true;
				System.out.println("PARABÉNS!! Jogador 2 Ganhou!!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("DEU VELHA");
			}
			
		}
		sc.close();

	}

}
