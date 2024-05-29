package exercicios_20;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Gere e imprima uma matriz M 10x10 com valores aleatórios entre
		0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
		qual é o maior e o menor valor da coluna 7.*/
		
		int[][] mat = new int[10][10];
	
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 10);
				System.out.print( mat[i][j] + " ");
			}
			System.out.println();
		}
		
		int menorDaLinha5 = mat[5][0];
		int maiorDaLinha5 = mat[5][0];
		int menorDaColuna7 = mat[0][7];
		int maiorDaColuna7 = mat[0][7];

		for(int j = 0; j < mat[5].length; j++) {
			if(mat[5][j] < menorDaLinha5) {
				menorDaLinha5 = mat[5][j];
			}
			if(mat[5][j] > maiorDaLinha5) {
				maiorDaLinha5 = mat[5][j];
			}
		}
		
		for(int i = 0; i < mat.length; i++) {
			if (mat[i][7] < menorDaColuna7) {
				menorDaColuna7 = mat[i][7];
			}
			if (mat[i][7] > maiorDaColuna7) {
				maiorDaColuna7 = mat[i][7];
			}
			
		}
		
		
		System.out.println("--------------------");
		System.out.println("O menor valor da linha 5 é: " + menorDaLinha5);
		System.out.println("O maior valor da linha 5 é: " + maiorDaLinha5);
		System.out.println("O menor valor da coluna 7 é: " + menorDaColuna7);
		System.out.println("O maior valor da coluna 7 é: " + maiorDaColuna7);
	}

}
