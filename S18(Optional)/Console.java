package Ex2;

public class Console extends Produto implements Tipos {

	private String peso;

	public Console(String nomeConsole, String nomeJogo, float preco, float frete, String lojas, String peso) {
		super(nomeConsole, nomeJogo, preco, frete, lojas);
		this.peso = peso;
	}

	public Console() {
		super();
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public void DescricaoJ() {}

	@Override
	public void ImprimirConsole() {
		super.ImprimirConsole();
		System.out.println("Peso da plataforma: "+this.peso);
	}

	@Override
	public void DescricaoC() {
		System.out.println("PS4/PS5 - Xbox - PC");
	}
}
