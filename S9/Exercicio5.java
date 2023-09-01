package Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("\nEscolha um item(1 a 6): ");
		a = leia.nextInt();
		System.out.println("\nQuanto vai comprar? ");
		b = leia.nextInt();
		
		switch (a) {
		case 1:
			System.out.print("\nProduto: Cachorro Quente.\nValor toral:"+b*10);
			break;
		case 2:
			System.out.println("\nProduto: X-Salada.\nValor toral:"+b*15);
			break;
		case 3:
			System.out.println("\nProduto: X-Bancon.\nValor toral:"+b*18);
			break;
		case 4:
			System.out.println("\nProduto: Bauru.\nValor toral:"+b*12);
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante.\nValor toral:"+b*8);
			break;
		case 6:
			System.out.println("\nProduto: Suco de laranja.\nValor toral: "+b*13);
			break;
		default:
			System.out.printf("\nEscolha um valor valido.");
			;
		
		}
	}

}
