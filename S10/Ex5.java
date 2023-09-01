package Ex10;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i=1, b=0;
		
		do {
			System.out.println("\nDigite um numero: ");
			i = leia.nextInt();
			
			if (i>0) {
				b=i+b;
			}
			
		} while (i!=0);
		
		System.out.println("\nA soma dos números positivos é: "+b);
	}

}
