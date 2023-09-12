package Ex1;

import java.util.List;

public class Cliente2 {
	private String nome;
	private String telefone;
	private String email;
	private String localidade;
	private int idade;

	public Cliente2(String nome, String telefone, String email, String localidade, int idade) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.localidade = localidade;
		this.idade = idade;
	}

	public Cliente2() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirPF(List<pessoaFisica> lista) {
		for(pessoaFisica m : lista) {
			System.out.println("Nome:"+m.getNome());
			System.out.println("Telefone:"+m.getTelefone());
			System.out.println("E-mail:"+m.getEmail());
			System.out.println("Localidade:"+m.getLocalidade());
			System.out.println("Idade:"+m.getIdade());
		}
	}
	public void imprimirPJ(List<pessoaJuridica> listaPJ) {
		for(pessoaJuridica m : listaPJ) {
			System.out.println("Nome:"+m.getNome());
			System.out.println("Telefone:"+m.getTelefone());
			System.out.println("E-mail:"+m.getEmail());
			System.out.println("Localidade:"+m.getLocalidade());
			System.out.println("Idade:"+m.getIdade());
		}
	}
}