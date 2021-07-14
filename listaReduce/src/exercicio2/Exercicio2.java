package exercicio2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio2 {
    public static void main (String[] args) {
//        2. Crie uma lista (streams) contendo as informações da tabela abaixo:
//        Nomes
//        Paulo
//        Camila
//        Ana Maria
//        Patrick
//        Ana Clara
//        Pedro
//        Alfredo
// Mostre a concatenação dos nomes que começam com P separando-os por “,”
// Mostre a concatenação dos nomes que começam com A separando-os por “,”
// Mostre a concatenação de todos os nomes separando-os por “,”

        List<String> names = Stream.of(
                "Paulo","Camila","Ana Maria","Patrick",
                "Ana Clara", "Pedro", "Alfredo")
                .collect(Collectors.toList());

        String concat = names.stream().filter(name -> name.startsWith("P")).reduce("", (s1, s2) -> s1.concat(s2 + ","));
        System.out.println("reduce concat: " + concat);

        concat = names.stream().filter(name -> name.startsWith("A")).reduce("", (s1, s2) -> s1.concat(s2 + ","));
        System.out.println("reduce concat: " + concat);

        concat = names.stream().reduce("", (s1, s2) -> s1.concat(s2 + ","));
        System.out.println("reduce concat: " + concat);

    }
}
