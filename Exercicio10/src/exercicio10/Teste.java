import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero 1");
		int numero1 = sc.nextInt();
		System.out.println("digite o numero 2");
		int numero2 = sc.nextInt();
		System.out.println("digite o numero 1");
		String operacao = sc.nextLine();
		
		MinhaThreadCalc t1 = new MinhaThreadCalc(numero1, numero2, operacao );
		
	}
}