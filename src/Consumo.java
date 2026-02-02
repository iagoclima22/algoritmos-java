import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		double distancia = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		double combustivel = sc.nextDouble();
		
		double consumo = distancia / combustivel;
		System.out.printf("Consumo medio = %.3f", consumo);
		
		sc.close();
	}

}
