package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		1. Utilizando os conceitos de stream da videoaula, utilize os métodos abordados para
		//		fazer este exercício. Crie um programa que:
		//		solicite ao usuário a entrada no último número da lista (stream) (n)
		//		Gere uma lista com números de 1 a n duplicados (1,1,2,2,3,3...)
		//		Mostre todos os números
		//		Mostre todos os números sem repetição
		//		Mostre todos os números ímpares sem repetição
		//		Mostre todos os números pares sem repetição
		//		Mostre todos os números a partir do 5 algarismo sem repetição
		//		Mostre todos os números multiplicados por 4 

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um numero: ");
		int n = sc.nextInt();

		List<Integer[]> numbers = Stream.iterate(new Integer[]{1, 1}, e -> new Integer[]{e[0]+1, e[1]+1})
		.limit(n)
		.collect(Collectors.toList());
		
		System.out.println("Mostre todos os números: ");

		numbers.stream().flatMap(e -> Stream.of(e)).forEach(e -> System.out.println(e));
		
		System.out.println("números sem repetição ");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("números ímpares sem repetição");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().forEach(e -> System.out.println(e));
		
		System.out.println("números pares sem repetição");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().filter(e -> e % 2 ==0).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números a partir do 5 algarismo sem repetição");
		
		numbers.stream().flatMap(e -> Stream.of(e)).skip(5).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números multiplicados por 4 ");
		
		numbers.stream().flatMap(e -> Stream.of(e)).distinct().map(e -> e*4).forEach(e -> System.out.println(e));

	}



}



