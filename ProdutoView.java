package loja_mvc;

public class ProdutoView {
	public void impremeDetalhesProduto(int codProduto, String nome, double preco, String descricao, int estoque) {
		System.out.println("Produto");
		System.out.println("Cod: " + codProduto);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Descrição: " + descricao);
		System.out.println("Estoque: " + estoque);
	}
}
