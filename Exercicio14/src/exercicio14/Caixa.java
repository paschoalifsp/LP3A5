package exercicio14;

public class Caixa {
	private int saldoCedulas;
	
		
	public Caixa(int saldoCedulas) {
		this.saldoCedulas = saldoCedulas;
	}


	public synchronized String transacao2 (String cliente, int cedulas){
		if (this.saldoCedulas <= cedulas) {
			
			try {
				int i=0;
				 while (this.saldoCedulas <= cedulas) {
					 this.saldoCedulas += 1;
					 System.out.println(" Reabastecendo cedulas " + i);
					 Thread.sleep(1000);
					 i++;
				}
				}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(" Cliente " + cliente + " esta realizando Saque ...");
			try {
				for (int i=0; i<=8; ++i){
					System.out.println(" tempo da transacao " + i);
					Thread.sleep(1000);
				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
		return "Transação Finalizada";
	}
}
