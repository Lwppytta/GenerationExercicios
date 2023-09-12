package Ex1;

import java.util.List;

public class pessoaJuridica extends Cliente2 {

	private String cnpj;

	public pessoaJuridica(String nome, String telefone, String email, String localidade, int idade, String cnpj) {
		super(nome, telefone, email, localidade, idade);
		this.cnpj = cnpj;
	}

	public pessoaJuridica() {
		super();
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public void imprimirPJ(List<pessoaJuridica> listaPJ) {
		System.out.println("************************************************");
		for (pessoaJuridica m : listaPJ) {
			System.out.println("CPF/CPNJ:" + m.getCnpj());
		}
		super.imprimirPJ(listaPJ);
	}
}