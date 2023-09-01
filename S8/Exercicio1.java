package Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		float a, b, c;

		System.out.println("\nSalario Atual: ");
		a = leia.nextFloat();
		System.out.println("\nAbono: ");
		b = leia.nextFloat();

		c = a + b;

		System.out.printf("\nSalario Novo: %.2f", c);

	}
}
