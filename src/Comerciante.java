import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] compra = new double[n];
		double[] venda = new double[n];
		double[] lucro = new double[n];
		double[] percentLucro = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Produto %d:%n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Preço de compra: ");
			compra[i] = sc.nextDouble();
			System.out.print("Preço de venda: ");
			venda[i] = sc.nextDouble();
		}
		
		int lucroAbaixo10 = 0;
		int lucro10e20 = 0;
		int lucroAcima20 = 0;
		for (int i=0; i<n; i++) {
			lucro[i] = venda[i] - compra[i];
			percentLucro[i] = lucro[i] * 100.0 / compra[i];
			if (percentLucro[i] < 10) {
				lucroAbaixo10++;
			} else if (percentLucro[i] <= 20) {
				lucro10e20++;
			} else {
				lucroAcima20++;
			}
		}
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.println("Lucro abaixo de 10%: " + lucroAbaixo10);
		System.out.println("Lucro entre 10% e 20%: " + lucro10e20);
		System.out.println("Lucro acima de 20%: " + lucroAcima20);
		
		double totalCompra = 0.0;
		double totalVenda = 0.0;
		for (int i=0; i<n; i++) {
			totalCompra += compra[i];
			totalVenda += venda[i];
		}
		double lucroTotal = totalVenda - totalCompra;
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);
		
		sc.close();
	}

}
