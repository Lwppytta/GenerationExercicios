package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		List<pessoaFisica> listaPF = new ArrayList<pessoaFisica>();
		List<pessoaJuridica> listaPJ = new ArrayList<pessoaJuridica>();
		pessoaFisica lis = new pessoaFisica();
		pessoaJuridica lisj = new pessoaJuridica();
		int pessoa;

		do {
			pessoaFisica m = new pessoaFisica();
			pessoaJuridica n = new pessoaJuridica();

			do {
				System.out.println("Pessoa Fisica(1) ou Juridica(2):");
				pessoa = leia.nextInt();
			} while (pessoa <= 0 || pessoa >= 3);

			if (pessoa == 1) {
				System.out.println("Digite o CPF:");
				m.setCpf(leia.next());
				System.out.println("Digite seu nome:");
				m.setNome(leia.next());
				System.out.println("Digite seu telefone:");
				m.setTelefone(leia.next());
				System.out.println("Digite seu e-mail:");
				m.setEmail(leia.next());
				System.out.println("Digite sua localidade:");
				m.setLocalidade(leia.next());
				System.out.println("Digite sua idade:");
				m.setIdade(leia.nextInt());

				listaPF.add(m);
			} else {
				System.out.println("Digite o CNPJ:");
				n.setCnpj(leia.next());
				System.out.println("Digite o nome:");
				n.setNome(leia.next());
				System.out.println("Digite o telefone:");
				n.setTelefone(leia.next());
				System.out.println("Digite o e-mail:");
				n.setEmail(leia.next());
				System.out.println("Digite a localidade:");
				n.setLocalidade(leia.next());
				System.out.println("Digite a idade:");
				n.setIdade(leia.nextInt());

				listaPJ.add(n);
			}

		} while ((listaPJ.size() + listaPF.size()) < 2);
		lis.imprimirPF(listaPF);
		lisj.imprimirPJ(listaPJ);
	}
}