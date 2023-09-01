package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("\nValor A: ");
		a = leia.nextInt();
		
		if (a%2==0) {
			System.out.println("\nSeu número é par.");
		}else if (a%2==1) {
			System.out.println("\nSeu número é impar.");
		}
		
		if (a>0) {
			System.out.println("\nSeu número é positivo.");
		}else if (a<0) {
			System.out.println("\nSeu número é negativo.");
		}else {
			System.out.println("\n0 é um número neutro.");
		}
		
		
	}

}
