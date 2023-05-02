package Exercicios;

public class Funcionario extends Pessoa {
	public String salario;
	// Outros atributos e métodos necessários

	public Funcionario(String nome, String email, String telefone, String salario) {
		super(nome, email, telefone);
		this.salario = salario;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public void realizarExameMedico() {
        // Código para realizar o exame médico
        System.out.println("Funcionário " + getNome() + " realizou o exame médico.");
    }
	
	public void imprimirDadosFuncionario() {
		System.out.println("Nome do funcionario : " + nome);
		System.out.println("Email do funcionario : " + email);
		System.out.println("Telefone do funcionario : " + telefone);
		System.out.println("Sálario do funcionario : " + salario);
		System.out.println();
	}
	
	

}
