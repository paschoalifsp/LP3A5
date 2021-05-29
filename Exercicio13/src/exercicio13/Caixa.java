package exercicio13;


public class Caixa {
	
	
	public synchronized String transacao (String cliente,  int tipoTransacao){
		if (tipoTransacao == 1) {
			System.out.println(" Cliente " + cliente + " esta realizando saque ...");
			
			try {
				for (int i=0; i<=8; ++i){
					System.out.println(" tempo da transacao " + i);
					Thread.sleep(1000);
				}}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else {
			System.out.println(" Cliente " + cliente + " esta realizando transferência ...");
			try {
				for (int i=0; i<=5; ++i){
					System.out.println(" tempo da transacao " + i);
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return "Transação Finalizada";
	}
}
