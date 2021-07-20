package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		try {
			if (x < 0 || y < 0) 
				throw new Excecao();
			if (x >= 1000 || y >= 1000)
				throw new Excecao2();
			
			int div = x/y;
			System.out.println(div);
							
		}
		catch(ArithmeticException e){
			
			System.out.println(e.getMessage());
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finalizada a execução");
		}
		

	}

}
