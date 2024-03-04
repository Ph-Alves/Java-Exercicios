package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exerc_vetores2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos números você quer digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double soma = 0;
		double media = 0;
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		media = soma/n;
		
		System.out.print("VALORES = ");
		for(int i=0; i<vect.length; i++){
			System.out.printf("%.2f ", vect[i]);
		}
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);
		
		sc.close();
	}

}
