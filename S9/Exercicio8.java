package Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int i;
		float s=1000, v;
		
		System.out.println("\nQual operação? (1 Saldo/2 Saque/3 Deposito)");
		i = leia.nextInt();
		
		switch (i){
		case 1:
			System.out.println("\nSeu saldo: "+s);
			break;
		case 2:
			System.out.println("\nValor do saque: ");
			v = leia.nextFloat();
			if (v>1000) {
				System.out.println("\nSaldo insuficiente.");
			} else if (v>0 && v<=1000) {
				System.out.println("\nValor do saldo antigo: "+s);
				s=s-v;
				System.out.println("\nValor do saldo novo: "+s+"\nValor sacado: "+v);
			} else {
				System.out.println("\nValor invalido!!!");
			}
			break;
		case 3:
			System.out.println("\nValor do deposito: ");
			v = leia.nextFloat();
			System.out.println("\nValor do saldo antigo: "+s);
			s=s+v;
			System.out.println("\nValor do saldo novo: "+s+"\nValor depositado: "+v);
			break;
			default:
				System.out.println("\nOperação Invalida!!!");
				;
		}
		
	}

}
