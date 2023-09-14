package Ex2;

public class Jogo extends Produto implements Tipos {

	private String genero;

	public Jogo(String nomeConsole, String nomeJogo, float preco, float frete, String lojas, String genero) {
		super(nomeConsole, nomeJogo, preco, frete, lojas);
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

	public void DescricaoC() {}

	@Override
	public void ImprimirJogo() {
		super.ImprimirJogo();
		System.out.println("Genero do game:" + getGenero());
	}

	@Override
	public void DescricaoJ() {
		System.out.println("Minecraft - Terraria - Stardew Valley");
	}
}
