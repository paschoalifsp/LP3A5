package exercicio4;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
//		Reescreva o código do exercício anterior lançando direto uma exceção caso o
//		nome com “W” não exista (sem usar isPresent(), usando orElseThrow.
		
		List<String> names = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		Optional<String> result = names.stream().filter(e -> e.startsWith("W")).findAny();
		
		System.out.println(result.orElseThrow(IllegalArgumentException::new));

		
		
		
		
	}

}
