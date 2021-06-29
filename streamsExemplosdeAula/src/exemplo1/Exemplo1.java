package exemplo1;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers =Arrays.asList(2,5,9,1,4,3,6,7);
		numbers.stream()
		.filter(n -> n>5)
		.map(n -> n*n)
		.forEach(System.out::println);


	}

}
