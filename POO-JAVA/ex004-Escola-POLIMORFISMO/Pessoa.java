package Polimorfismo;

public class Pessoa {

	public String nome;
	public String telefone;
	public String email;

	// Construtor da classe Pessoa
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void enviarEmail() {
		System.out.println("Enviando e-mail...");
	}

	public void imprimirDados() {
		System.out.println("Imprimindo os dados...");

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

}
