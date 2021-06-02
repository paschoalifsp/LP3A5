package exercicio11;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a frase");

		String frase = sc.nextLine();
		MinhaThreadContador t1 = new MinhaThreadContador(frase);
		



	}
}