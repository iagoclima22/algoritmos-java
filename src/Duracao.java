import java.util.Scanner;

public class Duracao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a duracao em segundos: ");
		int duracao = sc.nextInt();
		
		int horas = duracao / 3600;
		int minutos = duracao % 3600 / 60;
		int segundos = duracao % 3600 % 60;
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		
		sc.close();
	}

}
