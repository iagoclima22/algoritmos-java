import java.util.Scanner;

public class SequenciaImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.print("Digite o valor de x: ");
		x = sc.nextInt();
		
		for (int i=0; i<=x; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}

}
