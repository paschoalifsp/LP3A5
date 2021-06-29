package exercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		4. Crie uma lista (streams) contendo as informa��es da tabela abaixo:
//			Nomes
//			Paulo
//			Camila
//			Ana Maria
//			Patrick
//			Ana Clara
//			Pedro
//			Alfredo
//			Mostre somente os nomes que come�am com P
//			Mostre todos os nomes dos clientes separados por tamanho (n�mero de
//			caracteres)
//			Pesquise a letra inicial �A� e agrupe os nomes mostrando true e false, ou
//			seja, liste os valores que atendem ou n�o a regra de particionamento.
//			Mostre os nomes agrupados por tamanho, convertidos para mai�sculo e
//			separados por v�rgula
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Paulo");
		nomes.add("Camila");
		nomes.add("Ana Maria");
		nomes.add("Patrick");
		nomes.add("Pedro");
		nomes.add("Camila");
		nomes.add("Alfredo");
		
		nomes.stream().filter(e -> e.startsWith("P")).forEach(System.out::println);
		
		Map<Object, List<String>> mapa = nomes.stream().collect(Collectors.groupingBy(e -> e.substring(0, 1).equals("A")));
		
		System.out.println(mapa);
		
		Map<Object, List<String>> mapa2 = nomes.stream().collect(Collectors.groupingBy(e -> e.toUpperCase().length()));
		
		System.out.println(mapa2);
		

	}

}
