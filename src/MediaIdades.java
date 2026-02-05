import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as idades:");
		int idade = sc.nextInt();
		
		int soma = 0;
		int cont = 0;
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		} else {
			while (idade >= 0) {
				soma += idade;
				cont++;
				idade = sc.nextInt();
			}
			double media = (double) soma / cont;
			System.out.printf("MEDIA = %.2f", media);
		}		
		
		sc.close();
	}

}
