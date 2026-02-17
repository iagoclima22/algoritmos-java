import java.util.Scanner;

public class DiagonalNegativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		int cont = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NEGATIVOS = " + cont);
		
		
		sc.close();
	}

}
