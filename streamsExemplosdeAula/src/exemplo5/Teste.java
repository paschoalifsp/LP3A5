package exemplo5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pessoa> pessoas = new Pessoa(null, null, null, 0).populaPessoas();
		String brasileiros = pessoas.stream()
				.filter(pessoa -> pessoa.nacionalidade.equals("Brasil"))
				.sorted(Comparator.comparing(Pessoa::getNome))
				.map(pessoa -> pessoa.nome)
				.collect(Collectors.joining(", "));
		System.out.println("Brasileiros: " + brasileiros);
		System.out.println("Pessoas com M");
		pessoas.stream()
		.filter(pessoa -> pessoa.nome.startsWith("M"))
		.forEach(System.out::println);

	}

}
