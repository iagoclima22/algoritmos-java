import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de N: ");
		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=fat; i<=n; i++) {
			fat *= i;
		}
		
		System.out.println("FATORIAL = " + fat);
		
		sc.close();
	}

}
