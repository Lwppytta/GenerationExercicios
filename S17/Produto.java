package Ex2;

public abstract class Produto {
	private String nomeConsole;
	private String nomeJogo;
	private float preco;
	private float frete;
	private String lojas;

	public Produto(String nomeConsole, String nomeJogo, float preco, float frete, String lojas) {
		super();
		this.nomeConsole = nomeConsole;
		this.nomeJogo = nomeJogo;
		this.preco = preco;
		this.frete = frete;
		this.lojas = lojas;
	}

	public Produto() {
		super();
	}

	public String getNomeConsole() {
		return nomeConsole;
	}

	public void setNomeConsole(String nomeConsole) {
		this.nomeConsole = nomeConsole;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getFrete() {
		return frete;
	}

	public void setFrete(float frete) {
		this.frete = frete;
	}

	public String getLojas() {
		return lojas;
	}

	public void setLojas(String lojas) {
		this.lojas = lojas;
	}

	public void ImprimirJogo() {
		System.out.println("Jogo escolhido: "+this.nomeJogo);
		System.out.println("Preço: "+this.preco);
		System.out.println("Frete: "+this.frete);
		System.out.println("Loja: "+this.lojas);
	}

	public void ImprimirConsole() {
		System.out.println("Console escolhido: "+this.nomeConsole);
	}

}