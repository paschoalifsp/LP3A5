package exercicio2;

import java.util.Arrays;
import java.util.List;


public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Crie um programa que implemente os seguintes passos:
//			Crie um Stream contendo todos os n�meros de 0 a 9
//			Aplique um filtro mantendo apenas os n�meros pares
//			Ignores os dois primeiros n�meros
//			Limite o processamento aos dois primeiros n�meros
//			Aplique uma multiplica��o por 2 em cada elemento
//			Mostre o resultado final 
		
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		numbers.stream()
		.filter(e -> e % 2 == 0)
		.limit(2).map(e -> e * 2)
		.forEach(e -> System.out.println(e));

	}

}
