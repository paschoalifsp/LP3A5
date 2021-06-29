package exemplo2;

import java.util.stream.Stream;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("###Quadrados até 20###");
		Stream.iterate(1, n -> n < 20 , n -> n * 2)
		.forEach(x -> System.out.println(x));

	}

}
