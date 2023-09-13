package Ex2;

public abstract class Produto {
	private String nome;
	private float preco;
	private float peso;
	private float frete;
	private String lojas;

	public Produto(String nome, float peso, float preco, float frete, String lojas) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
		this.frete = frete;
		this.lojas = lojas;
	}
	
	public Produto() {
		super();
	}
	
	public void ImprimirJogo() {
		System.out.println("Nome(Console/Game):" + getNome());
		System.out.println("Peso/Tamanho:" +getPeso());
		System.out.println("Preço:" + getPreco());
		System.out.println("Frete:" + getFrete());
		System.out.println("Lojas:" + getLojas());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
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

}