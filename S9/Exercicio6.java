package Exercicios;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String n;
		int c;
		float s;
		
		System.out.println("\nSeu nome?");
		n = leia.next();
		System.out.println("\nCodigo da sua area? (1 Gerente/2 Vendedor/3 Supervisor/4 Motorista/5 Estoquista/6 Tecnico de TI)");
		c = leia.nextInt();
		System.out.println("\nSeu salário?");
		s = leia.nextFloat();
		
		switch (c) {
		case 1:
			System.out.printf("\nNome do colaborador: "+n+"\nCargo: Gerente\nSalario: "+(s+((s/100)*10)));
			break;
		case 2:
			System.out.println("\nNome do colaborador: "+n+"\nCargo: Vendedor\nSalario: "+(s+((s/100)*7)));
			break;
		case 3:
			System.out.println("\nNome do colaborador: "+n+"\nCargo: Supervisor\nSalario: "+(s+((s/100)*9)));
			break;
		case 4:
			System.out.println("\nNome do colaborador: "+n+"\nCargo: Motorista\nSalario: "+(s+((s/100)*6)));
			break;
		case 5:
			System.out.println("\nNome do colaborador: "+n+"\nCargo: Estoquista\nSalario: "+(s+((s/100)*5)));
			break;
		case 6:
			System.out.println("\nNome do colaborador: "+n+"\nCargo: Tecnico de TI\nSalario: "+(s+((s/100)*8)));
			break;
		default:
			System.out.printf("\nSiga as instruções por favor.");
			;
		
		}
		
	}

}
