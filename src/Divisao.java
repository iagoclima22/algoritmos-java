import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Entre com o numerador: ");
			double numerador = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			double denominador = sc.nextDouble();
			
			if (denominador != 0) {
				double divisao = (double) numerador / denominador;
				System.out.printf("DIVISAO = %.2f%n", divisao);
			} else {
				System.out.println("DIVISAO IMPOSSIVEL");
			}			
		}
		
		sc.close();
	}
}
