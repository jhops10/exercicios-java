package exercicios_19;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
		um vetor C, onde cada elemento de C é a soma dos respectivos
		elementos em A e B, ou seja:
		C[i] = A[i] + B[i].*/
		
		int[] vectA = new int[10];
		int[] vectB = new int[10];
		int[] vectC = new int[10];
		
		for(int i = 0; i < vectA.length; i++) {
			vectA[i] = i + 1;
			vectB[i] = i + 2;
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VECTOR A: ");
		for(int num : vectA) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("VECTOR B: ");
		for(int num : vectB) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("VECTOR C: ");
		for(int num : vectC) {
			System.out.print(num + " ");
		}

	}

}
