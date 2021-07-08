package exercicio3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio3 {
	public static void main(String[] args) {
		
//		Utilizando os conceitos de optional da videoaula, use os m�todos abordados para
//		fazer este exerc�cio.
//		crie uma lista (streams) contendo as informa��es da tabela abaixo:
//		Nomes
//		Paulo
//		Camila
//		Ana Maria
//		Patrick
//		Ana Clara
//		Pedro
//		Alfredo
//		Pesquise nomes que come�am com �W�
//		Caso n�o existam, mostre a mensagem �Nomes com esta letra n�o consta na
//		lista� � use .findAny() e .isPresent()
		
		List<String> names = Stream.of(
				"Paulo","Camila","Ana Maria","Patrick",
				"Ana Clara", "Pedro", "Alfredo")
				.collect(Collectors.toList());
		
		Optional<String> result = names.stream().filter(e -> e.startsWith("W")).findAny();
		
		if (result.isPresent()) {
			System.out.println("Nome encontrado.");
			} else {
			System.out.println("Nome n�o encontrado.");
			}
		
	}

}
