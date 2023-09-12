package Ex2;

import java.util.Scanner;

public class TestaProduto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Jogo m = new Jogo();
		Console n = new Console();

		System.out.println("Nome(Console/Game):");
		m.setNome(leia.next());
		System.out.println("Peso/Tamanho:");
		m.setPeso(leia.nextFloat());
		System.out.println("Preço:");
		m.setPreco(leia.nextFloat());
		System.out.println("Frete:");
		m.setFrete(leia.nextFloat());
		System.out.println("Lojas:");
		m.setLojas(leia.next());
		System.out.println("Genero do game:");
		m.setGenero(leia.next());
		System.out.println("Modelo do console:");
		n.setModelo(leia.next());

		m.ImprimirJogo();
		n.ImprimirConsole();
	}
}