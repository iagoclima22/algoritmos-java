import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i=0; i<vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		int cont = 0;
		for (int i=0; i<vet.length; i++) {
			if (vet[i] % 2 == 0) {
				soma += vet[i];
				cont++;
			}
		}
		
		if (cont != 0) {
			double media = soma / cont;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		
		sc.close();
	}

}
