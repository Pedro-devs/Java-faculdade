package Polimorfismo;

public class Professor extends Pessoa {
	public String materia;
	// Outros atributos e métodos necessários

	public Professor(String nome, String email, String telefone, String materia) {
		super(nome, email, telefone);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	@Override // usamos Override para pegar o metodo da classe mae(Pessoa) fazendo o polimorfismo
	public void enviarEmail() {
		// Código para enviar email informando período de férias da instituição
		System.out.println("Email enviado ao professor " + getNome() + " informando período de férias da instituição.");
	}

	@Override
	public void imprimirDados() {
		System.out.println("Nome do professor : " + nome);
		System.out.println("Email do professor : " + email);
		System.out.println("Telefone do professor : " + telefone);
		System.out.println("Matéria do professor : " + materia);
		System.out.println();
	}

}
