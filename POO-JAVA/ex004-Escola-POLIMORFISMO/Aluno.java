package Polimorfismo;

public class Aluno extends Pessoa {
	public String matricula;

	// Outros atributos e métodos necessários

	public Aluno(String nome, String email, String telefone, String matricula) {
		super(nome, email, telefone);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override // usamos Override para pegar o metodo da classe mae(Pessoa) fazendo o polimorfismo
	public void enviarEmail() {
		// Metodo para enviar email solicitando presença do aluno na secretaria
		System.out.println("Email enviado para o aluno " + getNome() + " solicitando sua presença na secretaria.");
	}

	@Override
	public void imprimirDados() {
		System.out.println("Nome do aluno : " + nome);
		System.out.println("Email do aluno : " + email);
		System.out.println("Telefone do Aluno : " + telefone);
		System.out.println("Número do Aluno : " + matricula);
		System.out.println();

	}

}
