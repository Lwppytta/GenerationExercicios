package Ex1;

import java.util.List;

public class pessoaFisica extends Cliente2 {

	private String cpf;

	public pessoaFisica(String nome, String telefone, String email, String localidade, int idade, String cpf) {
		super(nome, telefone, email, localidade, idade);
		this.cpf = cpf;
	}

	public pessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void imprimirPF(List<pessoaFisica> lista) {
		for (pessoaFisica m : lista) {
			System.out.println("CPF/CPNJ:" + m.getCpf());
		}
		super.imprimirPF(lista);
	}

}