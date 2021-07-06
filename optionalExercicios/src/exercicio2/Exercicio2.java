package exercicio2;

import java.util.Optional;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
//		2. Utilizando os conceitos de optional da videoaula, use os métodos abordados para
//		fazer este exercício. Crie um programa que:
//		a) Crie uma variável sem valor usando Optional
//		b) Crie uma variável com valor usando Optional
//		Testar as duas variáveis.
//		Usar orElseThrow para lançar a exceção no caso da variável vazia
//		Usar orElseThrow para mostrar conteúdo da variável não vazia
//		Mostre o resultado das duas situações
//		

		
		//Optional<String> testea = Optional.empty();
		
		Optional<String> testeb = Optional.of("teste");
		
		//String resultadoA = testea.orElseThrow(() -> new NullPointerException("Valor Vazio"));
		
		String resultadoB = testeb.orElseThrow(() -> new NullPointerException("Valor Vazio"));
		
		//System.out.println(resultadoA);
		System.out.println(resultadoB);
	

		
	}

}
