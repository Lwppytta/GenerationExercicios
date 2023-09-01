package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float a, b, c ,d, e;
		
		System.out.println("\nValor 1: ");
		a = leia.nextFloat();
		System.out.println("\nValor 2: ");
		b = leia.nextFloat();
		System.out.println("\nValor 3: ");
		c = leia.nextFloat();
		System.out.println("\nValor 4: ");
		d = leia.nextFloat();
		
		e = (a*b)-(c*d);
		
		System.out.println("\nDiferença: "+e);

	}
}
