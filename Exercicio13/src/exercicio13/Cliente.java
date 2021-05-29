package exercicio13;


public class Cliente implements Runnable {
	private String nome;
	private int tipoTransacao;
	private static Caixa caixa = new Caixa();
	
	public Cliente (String nome, int tipoTransacao){
		this.nome = nome;
		this.tipoTransacao = tipoTransacao ;
		new Thread(this, nome).start();
	}
	
	@Override
	public void run() {
		String status = caixa.transacao(nome, tipoTransacao);
		
		System.out.println(status);
	}
}
