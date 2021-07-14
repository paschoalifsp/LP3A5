package exercicio3;


import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Exercicio3 {

    public static void main (String[] args) {
//      Utilizando o método reduce, escreva um programa que receba um número e
//calcule o fatorial deste número.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = sc.nextInt();

     long resultado = LongStream.rangeClosed( 1, n )
                .reduce(1, ( long a, long b ) -> a * b);
        System.out.println(resultado);
    }
}
