package exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Conexao implements AutoCloseable {
	public Conexao() {
		System.out.println("Abrindo conexão!");
		throw new IllegalStateException();

	}
	public void lerDados() throws FileNotFoundException {
		System.out.println("Recebendo dados!");
		Reader reader = new BufferedReader(new FileReader("1.txt"));
		Reader reader2 = new BufferedReader(new FileReader("2.txt"));
		System.out.println(reader.toString() + " " + reader2.toString());

	}
	@Override
	public void close() throws Exception {
		System.out.println("Fechando conexão!");
	}
}