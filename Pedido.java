package loja_mvc;

public class Pedido {
	private int codPedido;
	private String numNF;
	private String dataSolicitacao;
	private double valorTotal;
	private String statusPedido;
	
	public int getCodPedido() {
		return codPedido;
	}
	
	public void setCodPedido(int codPedido) {
		this.codPedido = codPedido;
	}
	
	public String getNumNF() {
		return numNF;
	}
	
	public void setNumNF(String numNF) {
		this.numNF = numNF;
	}
	
	public String getDataSolicitacao() {
		return dataSolicitacao;
	}
	
	public void setDataSolicitacao(String dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public String getStatusPedido() {
		return statusPedido;
	}
	
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}	
}
