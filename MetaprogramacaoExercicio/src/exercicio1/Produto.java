package exercicio1;

public class Produto {
	
	private int codProduto;
	private String descricao;
	private int quantidade;
	
	
	public Produto() {
		super();
	}


	public Produto(int codProduto, String descricao, int quantidade) {
		super();
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}


	public int getCodProduto() {
		return codProduto;
	}


	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	

}
