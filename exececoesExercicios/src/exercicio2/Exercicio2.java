package exercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;

public class Exercicio2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try (Conexao conexao = new Conexao();) {
			conexao.lerDados();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}
}