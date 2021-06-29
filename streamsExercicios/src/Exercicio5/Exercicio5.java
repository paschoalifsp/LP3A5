package Exercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Utilizando a API Stream escreve um programa Java para apresentar até o 10º
		//		elemento da sequência de fibonnaci.

		int num1 = 1, num2 = 0;

		List<Integer> numbers = new ArrayList<Integer>();
		

		for(int i = 0; i < 10; i++){
			num1 = num1 + num2;
			num2 = num1 - num2;
			numbers.add(num1);
		}
		
		numbers.stream().forEach(e -> System.out.println(e));
	}



}


