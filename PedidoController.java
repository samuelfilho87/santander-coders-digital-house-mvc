package loja_mvc;

public class PedidoController {
	private Pedido pedido;
	private PedidoView pedidoView;

	public PedidoController(Pedido pedido, PedidoView pedidoView) {
		this.pedido = pedido;
		this.pedidoView = pedidoView;
	}

	public int getCodPedido() {
		return pedido.getCodPedido();
	}
	
	public void setCodPedido(int codPedido) {
		pedido.setCodPedido(codPedido);;
	}
	
	public String getNumNF() {
		return pedido.getNumNF();
	}
	
	public void setNumNF(String numNF) {
		pedido.setNumNF(numNF);
	}
	
	public String getDataSolicitacao() {
		return pedido.getDataSolicitacao();
	}
	
	public void setDataSolicitacao(String dataSolicitacao) {
		pedido.setDataSolicitacao(dataSolicitacao);
	}
	
	public double getValorTotal() {
		return pedido.getValorTotal();
	}
	
	public void setValorTotal(double valorTotal) {
		pedido.setValorTotal(valorTotal);
	}
	
	public String getStatusPedido() {
		return pedido.getStatusPedido();
	}
	
	public void setStatusPedido(String statusPedido) {
		pedido.setStatusPedido(statusPedido);
	}
	
	public void updateView() {
		pedidoView.imprimeDetalhesPedido(pedido.getCodPedido(), pedido.getNumNF(), pedido.getDataSolicitacao(), pedido.getValorTotal(), pedido.getStatusPedido());
	}
}
