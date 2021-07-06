package exercicio1;

import java.util.Optional;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exercício. Crie um programa que:
//			a) Crie uma variável sem valor usando Optional. para optional vazio implemente:
//			Teste: se o optional vazio obter a string usando orElse
//			Mostrar resultado
//			Teste: se o optional a vazio obter a string usando orElseGet
//			Mostrar resultado
//			b) Crie uma variável com valor usando Optional: uma com valor e outra vazia,
//			para optional vazio implemente:
//			Teste: se o optional vazio obter a string usando orElse
//			Mostrar resultado
//			Teste: se o optional a vazio obter a string usando orElseGet
//			Mostrar resultado 
		
		// Atividade a
		
		Optional<String> teste = Optional.empty();
		
		String resultadoA = teste.orElse("vazio");
		
		System.out.println(resultadoA);
		
		String resultadoB = teste.orElseGet(() ->"vazio");
		
		System.out.println(resultadoB);
		
		Optional<String> teste2 = Optional.of("teste");
		
		//Atividade b
		
		Optional<String> testeb = Optional.empty();
		
		//Optional<String> testeb = Optional.of("Com Valor");
		
		String resultadoC = testeb.orElse("Sem Valor");
		
		System.out.println(resultadoC);
		
		String resultadoD = testeb.orElseGet(() ->"Sem Valor");
		
		System.out.println(resultadoD);
		
		
		

	}

}
