package exercicio1;

public class Teste {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
//		Codifique uma classe qualquer a sua escolha, uma classe para fazer a reflex�o
//		da classe escolhida e uma classe Principal que ir� instanciar os objetos das duas
//		classes. N�o se esque�a de enviar os c�digos para o Github, inserir o link do reposit�rio
//		com o c�digo e enviar o link do reposit�rio para o moodle.
//		1. A Classe de reflex�o deve refletir e exibir, de acordo com a classe escolhida:
//		a) O Nome da classe
//		b) Localiza��o da classe (nome canonical)
//		c) Tipo da classe
//		d) Listar os atributos, os valores e seus tipos respectivos
//		e) Alterar o valor de um atributo
//		f) Mudar a visibilidade de um atributo
//		g) Listar o nome dos m�todos e seus respectivos retorno
		
		Produto produto = new Produto(1, "Notebook", 5);
		
		Reflexao.refletirObjeto(produto, Produto.class);
				
		
	}

}
