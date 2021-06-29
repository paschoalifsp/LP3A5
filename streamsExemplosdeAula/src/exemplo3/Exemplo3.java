package exemplo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("###Nome dos alunos###");
		List<String> alunos = new ArrayList<String>();
		alunos.add("John"); alunos.add("Ana");alunos.add("Carla");
		String agrupamento = alunos.stream().collect(Collectors.joining(", "));
		System.out.println("Lista de alunos: " + agrupamento);
		
		System.out.println("###Soma dos números###");
		List<Integer> numbers = Arrays.asList(2,5,9,1,4);
		IntSummaryStatistics soma = numbers.stream().collect(Collectors.summarizingInt(n->n));
		System.out.println("Soma: " + soma.getSum());

	}

}
