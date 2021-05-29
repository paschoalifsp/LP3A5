package exercicio14;

public class Cliente implements Runnable {

	private String nome;
	private int cedulas;
	private static Caixa caixa = new Caixa(0);


	public Cliente(String nome, int cedulas) {
		this.nome = nome;
		this.cedulas = cedulas;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {
		String status = caixa.transacao2(nome, cedulas);
		System.out.println(status);
	}
}