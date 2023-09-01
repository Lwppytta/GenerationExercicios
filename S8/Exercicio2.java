package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float a, b, c, d,e;
		
		System.out.println("\nNota 1: ");
		a = leia.nextFloat();
		System.out.println("\nNota 2: ");
		b = leia.nextFloat();
		System.out.println("\nNota 3: ");
		c = leia.nextFloat();
		System.out.println("\nNota 4: ");
		d = leia.nextFloat();
		
		e = (a+b+c+d)/4;
		
		System.out.printf("\nMédia final: %.0f",e);

	}
}
