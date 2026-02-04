import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double total = 0;
		
		System.out.print("Codigo do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		if (codigo == 1) {
			total = 5.00 * qtd;
		} else if (codigo == 2) {
			total = 3.50 * qtd;
		} else if (codigo == 3) {
			total = 4.80 * qtd;
		} else if (codigo == 4) {
			total = 8.90 * qtd;
		} else if (codigo == 5) {
			total = 7.32 * qtd;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", total);
		
		sc.close();
	}

}
