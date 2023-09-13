package Ex2;

public class Jogo extends Produto {

	private String genero;

	public Jogo(String nome, float peso, float preco, float frete, String lojas, String genero) {
		super(nome, peso, preco, frete, lojas);
		this.genero = genero;
	}

	public Jogo() {
		super();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public void ImprimirJogo() {
		System.out.println("Genero do game:"+ getGenero());
		super.ImprimirJogo();
	}
}
