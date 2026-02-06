import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int resultado = i * n;
			System.out.println(n + " x " + i + " = " + resultado);
		}
				
		sc.close();
	}
}
