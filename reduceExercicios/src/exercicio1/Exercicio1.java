package exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Utilizando os conceitos de reduce da aula, utilize os métodos abordados para fazer
//		este exercício. Crie um programa que:
//		a) Gere uma lista com 100 números aleatórios:
//		Mostre a soma de todos, usando reduce
//		Mostre a multiplicação de todos, usando reduce
//		Mostre o menor número, usando reduce
//		Mostre o maior número, usando reduce
		
			
			List<Integer> soma = Stream.generate(()->new Random().nextInt(10))
					.collect(Collectors.toList());
			
			Optional<Integer> resultadoSoma = soma.stream()
				      .reduce((n1, n2) -> n1 + n2);
			 
			System.out.println("soma: "+ resultadoSoma.get());
			
			Optional<Integer> resultadoMultiplicacao = soma.stream()
				      .reduce((n1, n2) -> n1 + n2);
			
			System.out.println("soma: "+ resultadoSoma.get());



	}

}
