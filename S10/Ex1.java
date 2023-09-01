package Ex10;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, i;
		
		System.out.println("\nDigite valor 1(menor): ");
		a = leia.nextInt();
		System.out.println("\nDigite valor 2(maior): ");
		b = leia.nextInt();
	
		if (a>b) {
			System.out.println("\nPrimeiro valor não é menor que o segundo.\nIntervalo invalido.");
		} else {
			System.out.println("\nNo intervalo entre "+a+" e "+b+":");
			for (i=a;i<=b;i++) {
				if (i%3==0 && i%5==0) {
					System.out.println("\n"+i+" é multipli de 3 e 5.");
				}
			}
		}
		
		
	}

}
