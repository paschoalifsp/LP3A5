package exercicio1;

import java.util.Arrays;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) Elaborar uma classe Java que possui uma lista de cinco números inteiros,
		//um método que receba a lista e a expressão lambda para imprimir todos
		//os números, assim como o quadrado, o dobro e somar mais 3 em cada
		//um dos elementos da lista.
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5);
		lista.forEach(n -> {
			System.out.println("numero: " +n);
			System.out.println("quadrado: " + n * n);
			System.out.println("dobro: " + n * 2);
			
		});
	}

}


