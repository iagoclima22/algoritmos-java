import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char temp;
		double f, c;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		temp = sc.next().charAt(0); 
		
		if (temp == 'F' || temp == 'f') {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			c = 5.0 / 9.0 * (f - 32);
			System.out.printf("Temperatura equivalente em Celsius: %.2f", c);
		} else if (temp == 'C' || temp == 'c') {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = 9.0 / 5.0 * c + 32;
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", f);
		}

		sc.close();
	}

}
