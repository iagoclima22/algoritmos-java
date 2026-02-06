import java.util.Scanner;

public class DentroFora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
												
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
			
		sc.close();
	}
}
