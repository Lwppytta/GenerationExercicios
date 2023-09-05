package Ex12;
import java.util.Iterator;
import java.util.Stack;
import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> p = new Stack<String>();
		
		int b=4;
		
		System.out.println("*********************");
		System.out.println("\n1 - Adicionar Livro na Pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar Livro da Fila");
		System.out.println("0 - Sair");
		System.out.println("\n*********************");
		
		while (b!=0) {
			
			System.out.println("Entre com a opção desejada:");
			b = leia.nextInt();
			
			switch (b) {
				case 1:
					System.out.println("\nDigite o nome do livro:");
					p.push(leia.next());
					System.out.println("Fila: "+p);
					System.out.println("Livro adicionado!");
					break;
				case 2:
					if (p.isEmpty()) {
						System.out.println("Fila vazia.");
					} else {
						System.out.println("\nLista de todos os livros:");
						Iterator<String> k = p.iterator();
						while(k.hasNext()) {
							System.out.println(k.next());
						}}
					break;
				case 3:
					if (p.isEmpty()) {
						System.out.println("Fila vazia.");
					} else {
						p.pop();
						System.out.println("Fila: "+p);
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