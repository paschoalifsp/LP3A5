package exercicio1;

public class Teste {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
//		Codifique uma classe qualquer a sua escolha, uma classe para fazer a reflexão
//		da classe escolhida e uma classe Principal que irá instanciar os objetos das duas
//		classes. Não se esqueça de enviar os códigos para o Github, inserir o link do repositório
//		com o código e enviar o link do repositório para o moodle.
//		1. A Classe de reflexão deve refletir e exibir, de acordo com a classe escolhida:
//		a) O Nome da classe
//		b) Localização da classe (nome canonical)
//		c) Tipo da classe
//		d) Listar os atributos, os valores e seus tipos respectivos
//		e) Alterar o valor de um atributo
//		f) Mudar a visibilidade de um atributo
//		g) Listar o nome dos métodos e seus respectivos retorno
		
		Produto produto = new Produto(1, "Notebook", 5);
		
		Reflexao.refletirObjeto(produto, Produto.class);
				
		
	}

}
