import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println();
		double somaAltura = 0.0;
		for (int i=0; i<altura.length; i++) {
			somaAltura += altura[i];
		}
		double mediaAltura = somaAltura / altura.length;
		System.out.printf("ALtura média: %.2f%n", mediaAltura);
		
		int somaMenor16 = 0;
		for (int i=0; i<idade.length; i++) {
			if (idade[i] < 16) {
				somaMenor16++;
			}
		}
		double percentMenor16 = somaMenor16 * 100 / idade.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentMenor16);
		
		for (int i=0; i<idade.length; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
