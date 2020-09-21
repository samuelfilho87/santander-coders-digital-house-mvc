package loja_mvc;

public class Produto {
	private int codProduto;
	private String nome;
	private double preco;
	private String descricao;
	private int estoque;
	
	public int getCodProduto() {
		return codProduto;
	}
	
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
