package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String a, b, c;
		
		System.out.println("\nCaracteristica 1(Vertebrado ou Invertebrado): ");
		a = leia.next();
		System.out.println("\nCaracteristica 2(Ave-Mamifero/Inseto-Anelideo): ");
		b = leia.next();
		System.out.println("\nCaracteristica 3(Carnivoro-Onivoro-Herbivoro/Hematofago-Herbivoro-Onivaro): ");
		c = leia.next();
		
		if (a.equals("vertebrado")) {
			
			if (b.equals("ave")) {
				
				if (c.equals("carnivoro")) {
					System.out.println("\nÁguia.");
				}else if (c.equals("onivoro")) {
					System.out.println("\nPomba.");
				}else {
					System.out.println("\nOpção invalida.");
				}
			}
			
			else if (b.equals("mamifero")) {
				
				if (c.equals("onivoro")) {
					System.out.println("\nHomem");
				}else if (c.equals("herbivoro")) {
					System.out.println("\nVaca");
				}else {
					System.out.println("\nOpção invalida.");
				}
			}
			
			else {
				System.out.println("\nOpção invalida.");
			}
		}
		
		else if (a.equals("invertebrado")) {
			
			if (b.equals("inseto")) {
				
				if (c.equals("hematofago")) {
					System.out.println("\nPulga.");
				}else if (c.equals("herbivoro")) {
					System.out.println("\nLagarta.");
				}else {
					System.out.println("\nOpção invalida.");
				}
			}
			
			else if (b.equals("anelideo")) {
				
				if (c.equals("hematofago")) {
					System.out.println("\nSanguessuga");
				}else if (c.equals("onivoro")) {
					System.out.println("\nMinhoca");
				}else {
					System.out.println("\nOpção invalida.");
				}
			}
			
			else {
				System.out.println("\nOpção invalida.");
			}
		}
	}

}
