package exercicio2;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//    2) Codificar uma classe Java para exibir uma mensagem por meio da
//	implementa��o de uma interface chamada �InterfaceFuncional�,
//	adicionando uma anota��o de interface funcional, utilizando do m�todo
//	�show� da interface para exibi��o da mensagem.
		
		InterfaceFuncional i = ((n) -> System.out.println(n));
		String mensagem = "oi";
		i.show(mensagem);

}
}
