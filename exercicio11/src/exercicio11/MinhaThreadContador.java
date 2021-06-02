package exercicio11;

public class MinhaThreadContador implements Runnable{

	private String frase; 
	
	public MinhaThreadContador(String frase){
		this.frase = frase;
		Thread t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {

		int vog = 0, cons = 0;

	    this.frase.toLowerCase();
	    for(int i = 0; i <= this.frase.length(); i++){
	        char c = this.frase.charAt(i);
	        if(c == 32) continue;
	        	if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
	            ++vog;
	            continue;
	        }
	        if(c >= 98 && c <= 122) ++cons;
	        
	        System.out.println("Vogais:" + vog + " Consontes: " + cons);
	    }
	    

		
	}

}
