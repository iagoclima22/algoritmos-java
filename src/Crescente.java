import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		
		do {
			System.out.println("Digite dois numeros:"
					+ "");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > y) {
				System.out.println("DECRESCENTE!");
			} else if (x < y) {
				System.out.println("CRESCENTE!");
			}
			
		} while (x != y);
		
		sc.close();
	}

}
