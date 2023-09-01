package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String n;
		int i;
		boolean d;
		
		System.out.println("\nDigite seu nome: ");
		n = leia.nextLine();
		System.out.println("\nDigite sua idade: ");
		i = leia.nextInt();
		System.out.println("\nJa doou sangue? (true/false) ");
		d = leia.nextBoolean();
		
		if (i>=18 && i<=59) {
			System.out.println("\n"+n+" está apto(a) a doar sangue!");
		}else if(i>=60 && i<=69) {
			if (d==true){
				System.out.println("\n"+n+" está apto(a) a doar sangue!");
			}else if(d==false) {
				System.out.println("\n"+n+" não está apto(a) a doar sangue.");
			}
		}else {
			System.out.println("\n"+n+" não está apto(a) a doar sangue.");
		}
		
	}

}
