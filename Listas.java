package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List <String> lista = new ArrayList<>();
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Bob");
		lista.add("Anna");
		lista.add(2, "Marco");
		
		System.out.printf("Tamanho: %s%n", lista.size());
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		lista.removeIf(x -> x.charAt(0) == 'M'); //Lambda ou predicado (ainda vai falar sobre)
		
		for (String x : lista) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		System.out.println("Index of Bob: " + lista.indexOf("Bob"));
		System.out.println("Index of Bob: " + lista.indexOf("Marco"));
		System.out.println("------------------");
		List <String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		String name = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		
		sc.close();
	}

}
