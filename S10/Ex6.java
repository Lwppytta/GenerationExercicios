package Ex10;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i=1;
		float b=0, c=0;
		
		do {
			System.out.println("\nDigite um numero: ");
			i = leia.nextInt();
			
			if (i%3==0) {
				b=b+i;
				c++;
			}
			
		} while (i!=0);
		
		System.out.println("\nA soma dos números positivos é: "+(b/(c-1)));
	}

}
