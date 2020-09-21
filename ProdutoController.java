package loja_mvc;

public class ProdutoController {
	private Produto produto;
	private ProdutoView produtoView;
	
	public ProdutoController(Produto produto, ProdutoView produtoView) {
		this.produto = produto;
		this.produtoView = produtoView;
	}

	public int getCodProduto() {
		return produto.getCodProduto();
	}
	
	public void setCodProduto(int codProduto) {
		produto.setCodProduto(codProduto);
	}
	
	public String getNome() {
		return produto.getNome();
	}
	
	public void setNome(String nome) {
		produto.setNome(nome);
	}
	
	public double getPreco() {
		return produto.getPreco();
	}
	
	public void setPreco(double preco) {
		produto.setPreco(preco);
	}
	
	public String getDescricao() {
		return produto.getDescricao();
	}
	
	public void setDescricao(String descricao) {
		produto.setDescricao(descricao);
	}
	
	public int getEstoque() {
		return produto.getEstoque();
	}
	
	public void setEstoque(int estoque) {
		produto.setEstoque(estoque);
	}
	
	public void updateView() {
		produtoView.impremeDetalhesProduto(produto.getCodProduto(), produto.getNome(), produto.getPreco(), produto.getDescricao(), produto.getEstoque());
	}
}
