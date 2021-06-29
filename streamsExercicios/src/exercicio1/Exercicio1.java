package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		1. Utilizando os conceitos de stream da videoaula, utilize os m�todos abordados para
		//		fazer este exerc�cio. Crie um programa que:
		//		solicite ao usu�rio a entrada no �ltimo n�mero da lista (stream) (n)
		//		Gere uma lista com n�meros de 1 a n duplicados (1,1,2,2,3,3...)
		//		Mostre todos os n�meros
		//		Mostre todos os n�meros sem repeti��o
		//		Mostre todos os n�meros �mpares sem repeti��o
		//		Mostre todos os n�meros pares sem repeti��o
		//		Mostre todos os n�meros a partir do 5 algarismo sem repeti��o
		//		Mostre todos os n�meros multiplicados por 4 

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um numero: ");
		int n = sc.nextInt();

		List<Integer> numbers = new ArrayList<Integer>();

		for(int i = 0; i <= n; i++) {
			numbers.add(i);
			numbers.add(i);
		}
		
		System.out.println("Mostre todos os n�meros: ");

		numbers.stream().forEach(e -> System.out.println(e));
		
		System.out.println("n�meros sem repeti��o ");
		
		numbers.stream().distinct().forEach(e -> System.out.println(e));
		
		System.out.println("n�meros �mpares sem repeti��o");
		
		numbers.stream().distinct().filter(e -> e%2 ==1).forEach(e -> System.out.println(e));
		
		System.out.println("n�meros pares sem repeti��o");
		
		numbers.stream().distinct().filter(e -> e%2 ==0).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros a partir do 5 algarismo sem repeti��o");
		
		numbers.stream().skip(5).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros multiplicados por 4 ");
		
		numbers.stream().map(e -> e*4).forEach(e -> System.out.println(e));

	}



}



