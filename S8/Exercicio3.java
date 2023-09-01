package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float sb, a, h, d, sl;
		
		System.out.println("\nSalario bruto: ");
		sb = leia.nextFloat();
		System.out.println("\nAdiconal noturno: ");
		a = leia.nextFloat();
		System.out.println("\nHoras extras: ");
		h = leia.nextFloat();
		System.out.println("\nDescontos: ");
		d = leia.nextFloat();
		
		sl = sb+a+(h*5)-d;
		
		System.out.printf("\nSalario Liquido: %.2f",sl);

	}
}
