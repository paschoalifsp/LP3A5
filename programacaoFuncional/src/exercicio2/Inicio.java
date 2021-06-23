package exercicio2;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    2) Codificar uma classe Java para exibir uma mensagem por meio da
//	implementação de uma interface chamada “InterfaceFuncional”,
//	adicionando uma anotação de interface funcional, utilizando do método
//	“show” da interface para exibição da mensagem.
		
		InterfaceFuncional i = ((n) -> System.out.println(n));
		String mensagem = "oi";
		i.show(mensagem);

}
}
