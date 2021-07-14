package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

		List<Integer[]> numbers = Stream.iterate(new Integer[]{1, 1}, e -> new Integer[]{e[0]+1, e[1]+1})
		.limit(n)
		.collect(Collectors.toList());
		
		System.out.println("Mostre todos os n�meros: ");

		numbers.stream().flatMap(e -> Stream.of(e)).forEach(e -> System.out.println(e));
		
		System.out.println("n�meros sem repeti��o ");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("n�meros �mpares sem repeti��o");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("n�meros pares sem repeti��o");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().filter(e -> e % 2 ==0).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros a partir do 5 algarismo sem repeti��o");
		
		numbers.stream().flatMap(e -> Stream.of(e)).skip(5).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os n�meros multiplicados por 4 ");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().map(e -> e*4).forEach(e -> System.out.println(e));

	}



}



