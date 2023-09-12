package Ex2;

public class Console extends Produto {

	private String modelo;

	public Console(String nome, float peso, float preco, float frete, String lojas, String modelo) {
		super(nome, peso, preco, frete, lojas);
		this.modelo = modelo;
	}

	public Console() {
		super();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void ImprimirConsole() {
		System.out.println("Modelo do console:" + getModelo());
	}
}
