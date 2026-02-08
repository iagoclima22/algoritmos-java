import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pCoelho, pRato, pSapo;
		char tipo;
		
		int total = 0;
		int coelho = 0;
		int rato = 0;
		int sapo = 0;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Quantidade de cobaias: ");
			int qtd = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			total += qtd;
			
			if (tipo == 'C') {
				coelho += qtd;
			} else if (tipo == 'R') {
				rato += qtd;
			} else if (tipo == 'S') {
				sapo += qtd;
			}			
		}
		
		pCoelho = coelho * 100.0 / total;
		pRato = rato * 100.0 / total;
		pSapo = sapo * 100.0 / total;
		
		System.out.println();
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total de coelhos: " + coelho);
		System.out.println("Total de ratos: " + rato);
		System.out.println("Total de sapos: " + sapo);
		System.out.printf("Percentual de coelhos: %.2f%n", pCoelho);
		System.out.printf("Percentual de ratos: %.2f%n", pRato);
		System.out.printf("Percentual de sapos: %.2f%n", pSapo);
		
		sc.close();
	}

}
