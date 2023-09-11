package Ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCliente {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Cliente> listCliente = new ArrayList<Cliente>();
		
		System.out.println("Cadastrando o cliente!");
		
		do {
			Cliente cliente = new Cliente();
			
			System.out.println("Digite o nome: ");
			cliente.setN(leia.next());
			System.out.println("Digite o genero: ");
			cliente.setG(leia.next());
			System.out.println("Digite o idade: ");
			cliente.setI(leia.nextInt());
			System.out.println("Digite o peso: ");
			cliente.setP(leia.nextFloat());
			System.out.println("Possui alguma deficiencia (true/false): ");
			cliente.setD(leia.nextBoolean());
			
			listCliente.add(cliente);
		} while(listCliente.size()<2);
			
		for(Cliente lista : listCliente) {
			System.out.println("Nome: "+lista.getN());
			System.out.println("Genero: "+lista.getG());
			System.out.println("Idade: "+lista.getI());
			System.out.println("Peso: "+lista.getP());
			System.out.println("Def.: "+lista.getD());
		}
	}
}