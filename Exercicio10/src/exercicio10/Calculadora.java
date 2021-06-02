package exercicio10;

public class Calculadora {

	public synchronized int calcular(int n1, int n2, char op){

		int resultado = 0;

		switch (op) {
		case '+':
			resultado = n1 + n2;
			break;
		case '-':
			resultado = n1 - n2;
			break;
		case '*':
			resultado = n1 * n2;
			break;
		case '/':
			resultado = n1 / n2;
			break;
		default:
			System.out.println("Operação inválida");
		}

		return resultado;
	}

}
