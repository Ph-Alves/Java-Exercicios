package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exerc_vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
		
		double[] number = new double[n];
		
		for (int i=0; i<number.length; i++) {
			System.out.print("Digite um número: ");
			number[i] = sc.nextDouble();
		}
		
		System.out.println("NÚMEROS IMPARES:");
		
		for (int i=0; i<number.length; i++) {
			if (number[i] < 0) {
				System.out.printf("%.2f%n", number[i]);
			}
		}
		
		sc.close();
	}

}
