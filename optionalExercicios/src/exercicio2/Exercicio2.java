package exercicio2;

import java.util.Optional;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
//		2. Utilizando os conceitos de optional da videoaula, use os m�todos abordados para
//		fazer este exerc�cio. Crie um programa que:
//		a) Crie uma vari�vel sem valor usando Optional
//		b) Crie uma vari�vel com valor usando Optional
//		Testar as duas vari�veis.
//		Usar orElseThrow para lan�ar a exce��o no caso da vari�vel vazia
//		Usar orElseThrow para mostrar conte�do da vari�vel n�o vazia
//		Mostre o resultado das duas situa��es
//		

		
		//Optional<String> testea = Optional.empty();
		
		Optional<String> testeb = Optional.of("teste");
		
		//String resultadoA = testea.orElseThrow(() -> new NullPointerException("Valor Vazio"));
		
		String resultadoB = testeb.orElseThrow(() -> new NullPointerException("Valor Vazio"));
		
		//System.out.println(resultadoA);
		System.out.println(resultadoB);
	

		
	}

}
