import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, dinheiro, troco, total, faltaPagar;
		int qtd;
		
		System.out.print("Preço unitário do produto: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = preco * qtd;
		if (dinheiro >= total) {
			troco = dinheiro - total;
			System.out.printf("TROCO = %.2f%n", troco);
		} else {
			faltaPagar = total - dinheiro;
			System.out.printf("DINHEIRO INFUFICIENTE. FALTAM %.2f REAIS", faltaPagar);
		}
		
		sc.close();
	}

}
