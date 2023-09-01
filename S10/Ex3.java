package Ex10;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int d=0, i=0, j=0, c=0;
		
		System.out.println("\nDigite um numero negativo para sair.");
		
		while (d>=0) {
			System.out.println("\nDigite sua idade: ");
			d = leia.nextInt();
			if (d<21 && d>=0) {
				j++;
			} else if(d>50) {
				i++;
			}
			c++;
		}
		System.out.println("\nTotal de pessoas: "+c+"\nTotal de pessoas menores de 21 anos: "+j+"\nTotal de pessoas maiores de 50 anos: "+i);		
	}

}
