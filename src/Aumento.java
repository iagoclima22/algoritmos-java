import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.00) {
			porcentagem = 20;
			aumento = 20.0 / 100.0 * salario;
		} else if (salario <= 3000.00) {
			porcentagem = 15;
			aumento = 15.0 /100.0 * salario;
		} else if (salario <= 8000.00) {
			porcentagem = 10;
			aumento = 10.0 / 100.0 * salario;
		} else {
			porcentagem = 5;
			aumento = 5.0 / 100.0 * salario;
		}
		
		novoSalario = salario + aumento;
		
		System.out.printf("Novo salario = R$ %.2f%n", novoSalario);
		System.out.printf("Aumento = R$ %.2f%n", aumento);
		System.out.printf("Porcentagem = %d %%", porcentagem);
		
		sc.close();
	}

}
