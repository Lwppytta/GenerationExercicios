package Ex2;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class TestaProduto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 0;
		float m = 0;
		boolean lop = true;

		Jogo j = new Jogo();
		j.setPreco(15.99f);
		j.setGenero("Slice of life");
		Console c = new Console();
		c.setPeso("2,8/4,5 - 1,9/4,4 - Depende do PC");

		System.out.println("Boa noite, 3 jogos estão na promoção hoje!!!\nQual vai escolher?");
		System.out.println("Em qual plataforma vai jogar?");
		c.DescricaoC();
		c.setNomeConsole(leia.next());
		System.out.println("Escolha um jogo: ");
		j.DescricaoJ();
		j.setNomeJogo(leia.next());
		System.out.println("Loja que vai comprar:");
		j.setLojas(leia.next());

		do {
			try {
				System.out.println("Qual o valor do frete?");
				m = leia.nextFloat();

				j.setFrete(m);
				i = 1;
				
				lop = false;
				Optional<Float> checaNulo = Optional.ofNullable(m);
				
				if (checaNulo.isPresent()) {
					System.out.println("Frete não é nulo.");
				}else {
					System.out.println("Frete é nulo.");
				}
			} catch (InputMismatchException e) {
				System.err.println("Erro:" + e);
				leia.nextLine();
				System.out.println("Isso é um valor?");
			} finally {
				if (i != 1) {
					System.out.println("Frete invalido.");
					System.out.println("...............");
				} else {
					System.out.println("...............");
				}
			}
		} while (lop);

		j.ImprimirJogo();
		c.ImprimirConsole();
		
		
	}
}