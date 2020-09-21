package loja_mvc;

public class ClienteController {
	private Cliente cliente;
	private ClienteView clienteView;
	
	public ClienteController(Cliente cliente, ClienteView clienteView) {
		this.cliente = cliente;
		this.clienteView = clienteView;
	}

	public int getCodCliente() {
		return cliente.getCodCliente();
	}
	
	public void setCodCliente(int codCliente) {
		cliente.setCodCliente(codCliente);
	}
	
	public String getNome() {
		return cliente.getNome();
	}
	
	public void setNome(String nome) {
		cliente.setNome(nome);
	}
	
	public String getCpf() {
		return cliente.getCpf();
	}
	
	public void setCpf(String cpf) {
		cliente.setCpf(cpf);
	}
	
	public String getRg() {
		return cliente.getRg();
	}
	
	public void setRg(String rg) {
		cliente.setRg(rg);
	}
	
	public String getEmail() {
		return cliente.getEmail();
	}
	
	public void setEmail(String email) {
		cliente.setEmail(email);
	}
	
	public String getNascimento() {
		return cliente.getNascimento();
	}
	
	public void setNascimento(String nascimento) {
		cliente.setNascimento(nascimento);
	}
	
	public void updateView() {
		clienteView.imprimeDetalhesCliente(cliente.getCodCliente(), cliente.getNome(), cliente.getCpf(), cliente.getRg(), cliente.getEmail(), cliente.getNascimento());
	}
}
