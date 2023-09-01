package Ex10;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int c, a, p=0, i=0;
		
		for (c=0;c<10;c++) {
			System.out.println("\nDigite um número: ");
			a = leia.nextInt();
			if (a%2==0) {
				p++;
			} else if (a%2==1) {
				i++;
			}
		}
		
		System.out.println("\nTotal de numeros pares: "+p+"\nTotal de numeros impares: "+i);
		
	}

}
