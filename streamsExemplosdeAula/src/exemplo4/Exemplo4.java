package exemplo4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e",
		"f"}};
		List<String> collect = Stream.of(array) // Stream<String[]>
				.flatMap(Stream::of) // Stream<String>
				.collect(Collectors.toList()); // return a List
		collect.forEach(System.out::println);

	}

}
