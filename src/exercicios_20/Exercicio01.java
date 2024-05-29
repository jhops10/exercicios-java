package exercicios_20;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. 
		 Após isso determine o maior número da matriz e a sua posição(linha, coluna).*/
		
		int[][] mat = new int[4][4];
		int maiorNumero = mat[0][0];
		int linhaMaiorNumero = 0;
		int colunaMaiorNumero = 0;
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 10);
				if(mat[i][j] > maiorNumero) {
					maiorNumero = mat[i][j];
					linhaMaiorNumero = i;
					colunaMaiorNumero = j;
				}
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println("A posição do maior número da matriz é: (" + linhaMaiorNumero + "," + colunaMaiorNumero + ")");

	}

}
