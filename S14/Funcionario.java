package Ex14;

import java.util.List;

public class Funcionario {
	private String nome;
	private String email;
	private String cargo;
	private int idade;
	private int telefone;
	
	public Funcionario(String nome, String email, String cargo, int idade, int telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.cargo = cargo;
		this.idade = idade;
		this.telefone = telefone;
	}

	public Funcionario() {
		super();
	}

	public void imprimir(List<Funcionario> lista) {
		for(Funcionario d : lista) {
			System.out.println("Nome: "+d.getNome());
			System.out.println("E-mail: "+d.getEmail());
			System.out.println("Idade: "+d.getIdade());
			System.out.println("Cargo: "+d.getCargo());
			System.out.println("Telefone: "+d.getTelefone());
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}