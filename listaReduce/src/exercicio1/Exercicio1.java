package exercicio1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Exercicio1 {
    public static void main (String[] args) {
//        1. Utilizando os conceitos de reduce da aula, utilize os métodos abordados para fazer
//        este exercício. Crie um programa que:
//        a) Gere uma lista com 100 números aleatórios:
// Mostre a soma de todos, usando reduce
// Mostre a multiplicação de todos, usando reduce
// Mostre o menor número, usando reduce
// Mostre o maior número, usando reduce

        List<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 100; i++) {
            int n = (int) (Math.floor(Math.random() * (5 + 1) + 3));
            numbers.add(n);
        };

        numbers.forEach(System.out::println);


        Optional<Integer> soma = numbers.stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println("reduce soma: "+ soma.get());

        Optional<Integer> multiplicacao = numbers.stream()
                .reduce((n1, n2) -> n1 * n2);
        System.out.println("reduce multiplicação: " + multiplicacao.get());

        Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maior: " + max);

        Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Menor: " + min);

    }
}
