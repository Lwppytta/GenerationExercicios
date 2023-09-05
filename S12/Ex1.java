package Ex12;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> f = new LinkedList<String>();
		
		int b=4;
		
		System.out.println("*********************");
		System.out.println("\n1 - Adicionar Cliente na Fila");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair");
		System.out.println("\n*********************");
		
		while (b!=0) {
			
			System.out.println("Entre com a opção desejada:");
			b = leia.nextInt();
			
			switch (b) {
				case 1:
					System.out.println("\nDigite o nome do cliente:");
					f.add(leia.next());
					System.out.println("Fila: "+f);
					System.out.println("Cliente adicionado!");
					break;
				case 2:
					if (f.isEmpty()) {
						System.out.println("Fila vazia.");
					} else {
						System.out.println("\nLista de todos os cliente:");
						Iterator<String> k = f.iterator();
						while(k.hasNext()) {
							System.out.println(k.next());
						}}
					break;
				case 3:
					if (f.isEmpty()) {
						System.out.println("Fila vazia.");
					} else {
						f.remove();
						System.out.println("Fila: "+f);
						}
					break;
				case 0:
					break;
				default :
					System.out.println("Opção inavlida, tente novamente!");
					break;
			}}
		System.out.println("\nVocê saiu!");
}}