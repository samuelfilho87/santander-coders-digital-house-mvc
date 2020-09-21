package loja_mvc;

public class PedidoView {
	public void imprimeDetalhesPedido(int codPedido, String numNF, String dataSolicitacao, double valorTotal, String statusPedido) {
		System.out.println("Pedido");
		System.out.println("Cod: " + codPedido);
		System.out.println("NF: " + numNF);
		System.out.println("Data solicitação: " + dataSolicitacao);
		System.out.println("Valor total: " + valorTotal);
		System.out.println("Status: " + statusPedido);
	}
}
