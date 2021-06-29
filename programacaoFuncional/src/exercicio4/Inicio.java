package exercicio4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Desenvolver uma classe Java Avaliacao com os atributos disciplina, aluno
		//		e nota, utilizando expressão lambda, crie uma trhead para instanciar cada
		//		objeto. Ainda utilizando lambda, ordene a lista pelo nome dos alunos
		//		cadastrados e imprima a lista de aprovados com suas respectivas notas
		//		e nomes, considere como aprovados os alunos que obtiveram nota igual
		//		ou superior a 6.
		
		 List<Avaliacao> listAvaliacoes = Arrays.asList(new Avaliacao("Biologia", "Thais", 8),new Avaliacao("Biologia", "Marlene", 5));
		 
	
				Collections.sort(listAvaliacoes, (Avaliacao av1, Avaliacao av2) -> av1.getAluno().compareTo(av2.getAluno()));
				
				listAvaliacoes.forEach(av -> System.out.println(av.getAluno()));
				listAvaliacoes.stream().filter(av -> av.getNota() >=6).forEach(av -> System.out.println(av.getAluno()));
				
				

	}

}
