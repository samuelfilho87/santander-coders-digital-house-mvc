package loja_mvc;

public class TelefoneView {
	public void imprimeDetalhesTelefone(int codTelefone, String ddd, String numero, int codCliente) {
		System.out.println("Telefone");
		System.out.println("Cod: " + codTelefone);
		System.out.println("DDD: " + ddd);
		System.out.println("Número: " + numero);
		System.out.println("Cod. Cliente: " + codCliente);
	}
}
