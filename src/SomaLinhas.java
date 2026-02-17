import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		double[] vet = new double[m];
		
		for (int i=0; i<mat.length; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a linha:");
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("VETOR GERADO:");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				vet[i] += mat[i][j];
			}
			System.out.printf("%.1f%n", vet[i]);
		}
		
		sc.close();
	}

}
