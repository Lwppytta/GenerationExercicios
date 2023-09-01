package Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float a, b;
		int c;
		
		System.out.println("\nDigite valor 1: ");
		a = leia.nextFloat();
		System.out.println("\nDigite valor 2: ");
		b = leia.nextFloat();
		System.out.println("\nQual operação? (1 Soma/2 Subtração/3 Multiplicação/4 Divisão)");
		c = leia.nextInt();
		
		switch (c) {
		case 1:
			System.out.println("\nSoma "+a+" + "+b+" :"+(a+b));
			break;
		case 2:
			System.out.println("\nSubtração "+a+" - "+b+" :"+(a-b));
			break;
		case 3:
			System.out.println("\nMultiplicação "+a+" * "+b+" :"+(a*b));
			break;
		case 4:
			System.out.println("\nDivisão "+a+" / "+b+" :"+(a/b));
			break;
		default:
			System.out.println("Operação invalida");
				;
		}
		
	}

}
