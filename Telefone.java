package loja_mvc;

public class Telefone {
	private int codTelefone;
	private String ddd;
	private String numero;
	private int codCliente;
	
	public int getCodTelefone() {
		return codTelefone;
	}
	
	public void setCodTelefone(int codTelefone) {
		this.codTelefone = codTelefone;
	}
	
	public String getDdd() {
		return ddd;
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public int getCodCliente() {
		return codCliente;
	}
	
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
}
