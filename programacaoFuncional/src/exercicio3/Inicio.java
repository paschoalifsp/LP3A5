package exercicio3;

public class Inicio {
	
	public static void main(String[] args) {
		
		final Fatorial fat = new Fatorial();
		
		fat.func = (n) -> {
			int result = 1;
            for (int i = 1; i <= n; i++)
            result = i * result;
            return result;
        };
		
        System.out.println(fat.func.apply(6));
	}
	
}
