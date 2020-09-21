package loja_mvc;

public class TelefoneController {
	private Telefone telefone;
	private TelefoneView telefoneView;
	
	public TelefoneController(Telefone telefone, TelefoneView telefoneView) {
		this.telefone = telefone;
		this.telefoneView = telefoneView;
	}
	
	public int getCodTelefone() {
		return telefone.getCodCliente();
	}
	
	public void setCodTelefone(int codTelefone) {
		telefone.setCodTelefone(codTelefone);
	}
	
	public String getDdd() {
		return telefone.getDdd();
	}
	
	public void setDdd(String ddd) {
		telefone.setDdd(ddd);
	}
	
	public String getNumero() {
		return telefone.getNumero();
	}
	
	public void setNumero(String numero) {
		telefone.setNumero(numero);
	}
	
	public int getCodCliente() {
		return telefone.getCodCliente();
	}
	
	public void setCodCliente(int codCliente) {
		telefone.setCodCliente(codCliente);
	}
	
	public void updateView() {
		telefoneView.imprimeDetalhesTelefone(telefone.getCodCliente(), telefone.getDdd(), telefone.getNumero(), telefone.getCodCliente());
	}
}
