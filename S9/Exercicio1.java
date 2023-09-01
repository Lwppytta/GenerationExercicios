package Exercicios;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("\nValor A: ");
		a = leia.nextInt();
		System.out.println("\nValor B: ");
		b = leia.nextInt();
		System.out.println("\nValor C: ");
		c = leia.nextInt();
		
		if (a+b>c) {
			System.out.println("\nSoma de A + B é maior que C.");
		} else if (a+b<c) {
			System.out.println("\nSoma de A + B é menor que C.");
		}else if (a+b==c) {
			System.out.println("\nSoma de A + B é igual a C.");
		}
	}

}
