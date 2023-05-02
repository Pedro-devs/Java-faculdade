import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		AlunoTeste aluno = new AlunoTeste();

		System.out.println("Digite o nome do aluno");
		aluno.nome = sc.next();

		System.out.println("Digite a nota da primeira prova");
		aluno.nota1 = sc.nextInt();
		System.out.println("Digite a nota da segunda prova");
		aluno.nota2 = sc.nextInt();
		
		aluno.imprimirDados();

	}

}
