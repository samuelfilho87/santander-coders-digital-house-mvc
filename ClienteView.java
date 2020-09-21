package loja_mvc;

public class ClienteView {
	public void imprimeDetalhesCliente(int codCliente, String nome, String cpf, String rg, String email, String nascimento) {
		System.out.println("Cliente");
		System.out.println("Cod: " + codCliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("E-mail: " + email);
		System.out.println("Nascimento: " + nascimento);
	}
}
