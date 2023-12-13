package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;

		System.out.print("Digite uma Frase: ");
		y = sc.nextInt();
		sc.nextLine();
		x = sc.nextLine();
		System.out.printf("Frase digitada: %s", x);

		sc.close();
	}

}
