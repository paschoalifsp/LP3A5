package exercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio3 {
	public static void main(String[] args) {
//		3. Utilizando os conceitos de stream da videoaula, utilize os métodos abordados para
//		fazer este exercício. Crie um programa que:
//		Gere uma lista com 100 números aleatórios e mostre estes números
//		Gere uma lista com 10 números quaisquer o
//		Mostre o maior número o
//		Mostre o menor número
//		Mostre a quan dade de números 
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++) {
			int n = (int) (Math.random()*10);
			numbers.add(n);
		}
		
		System.out.println("lista de 100 numeros aleaorios");
		numbers.stream().forEach(e -> System.out.println(e));
		
		List<Integer> numbers2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int n2 = (int) (Math.random()*10);
			numbers2.add(n2);
		}
		
		System.out.println("lista de 10 numeros aleaorios");
		
		numbers2.stream().forEach(e -> System.out.println(e));
	
		Optional<Integer> menorNumero = numbers2.stream().min(Comparator.naturalOrder());
		System.out.println(" Menor: "+menorNumero.get());
		
		Optional<Integer> maiorNumero = numbers2.stream().max(Comparator.naturalOrder());
		System.out.println(" Maior:" + maiorNumero.get());
		
		long quantidade = numbers2.stream().count();
		System.out.println("Quantidade" + quantidade);


	}
}
