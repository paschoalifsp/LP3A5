package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

		List<Integer> numbers = new ArrayList<Integer>();

		for(int i = 0; i <= n; i++) {
			numbers.add(i);
			numbers.add(i);
		}
		
		System.out.println("Mostre todos os números: ");

		numbers.stream().forEach(e -> System.out.println(e));
		
		System.out.println("números sem repetição ");
		
		numbers.stream().distinct().forEach(e -> System.out.println(e));
		
		System.out.println("números ímpares sem repetição");
		
		numbers.stream().distinct().filter(e -> e%2 ==1).forEach(e -> System.out.println(e));
		
		System.out.println("números pares sem repetição");
		
		numbers.stream().distinct().filter(e -> e%2 ==0).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números a partir do 5 algarismo sem repetição");
		
		numbers.stream().skip(5).forEach(e -> System.out.println(e));
		
		System.out.println("Mostre todos os números multiplicados por 4 ");
		
		numbers.stream().map(e -> e*4).forEach(e -> System.out.println(e));

	}



}



