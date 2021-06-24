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
				
				
//				List<Pessoa> listPessoas2 = Arrays.asList(new Pessoa("Eduardo", 29),
//						new Pessoa("Luiz", 32), new Pessoa("Bruna", 26));
//						Collections.sort(listPessoas2, (Pessoa pessoa1, Pessoa pessoa2)
//						-> pessoa1.getNome().compareTo(pessoa2.getNome()));
//						listPessoas2.forEach(p -> System.out.println(p.getNome()));
//
//				
//				
//				
//				 
//				.stream()
//					.limit(7)
//					.filter(e -> e % 2 == 0)
//					.map(e -> e * 2)
//					.forEach(System.out::println);
//			
		
//		Thread t = new Thread(()->{
//			try {
//				for (int i=0; i<6; i++){
//					System.out.println(nome + " contador " + i);
//					Thread.sleep(tempo);
//				}
//			} catch (InterruptedException e) { e.printStackTrace(); }
//			System.out.println(nome + " terminou a execução");
//		});
//		t.start();

	}

}
