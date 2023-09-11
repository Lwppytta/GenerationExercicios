package Ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		Funcionario dados2 = new Funcionario();
		
		do {
			Funcionario dados = new Funcionario();
				
			System.out.println("Digite o nome: ");
			dados.setNome(leia.next());
			System.out.println("Digite o e-mail: ");
			dados.setEmail(leia.next());
			System.out.println("Digite a idade: ");
			dados.setIdade(leia.nextInt());
			System.out.println("Digite o cargo: ");
			dados.setCargo(leia.next());
			System.out.println("Digite o telefone: ");
			dados.setTelefone(leia.nextInt());
			
			lista.add(dados);
		} while (lista.size()<2);
		
		dados2.imprimir(lista);
		
	}
}