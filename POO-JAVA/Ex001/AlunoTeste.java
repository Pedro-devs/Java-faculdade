

public class AlunoTeste {
	public String nome;
	public int nota1;
	public int nota2;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int media(int nota1, int nota2) {
		return (nota1 + nota2) / 2;
	}

	public void imprimirDados() {
        System.out.println("---------------------------");
		System.out.println("Nome do aluno é " + nome + "      |");
		System.out.println("Nota da primeira prova " + nota1+ "   |");
		System.out.println("Nota da segunda prova " + nota2+ "    |");
		System.out.println("Média do aluno é " + media(nota1, nota2)+ "         |");
		System.out.println("---------------------------");

	}

}
