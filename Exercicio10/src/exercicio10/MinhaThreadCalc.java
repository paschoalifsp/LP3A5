package exercicio10;

public class MinhaThreadCalc implements Runnable {
	private String operacao;
	private int numero1;
	private int numero2;
	private static Calculadora calc = new Calculadora();
	
	public MinhaThreadCalc (String operacao, int numero1, int numero2){
		this.operacao = operacao;
		this.numero1 = numero1;
		this.numero2 = numero2;
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		
		int resultado = calc.calcular(this.numero1, this.numero2, this.operacao );
		System.out.println("Resultado : " + resultado);
		
	}
}
