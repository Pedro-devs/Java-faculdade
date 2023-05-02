package Exercicios;

import java.util.Scanner;

public class Escola {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno("Pedro", "(11)923232", "pedro@gmail.com", "31312313");
		Funcionario funcionario = new Funcionario("Xuxu", "(11)323245", "xuxu@gmail.com", "R$2000");
		Professor professor = new Professor("Carlos", "(11)9239294", "carlos@gmail.com","Programação Orientada a Objetos");
		
		String opcao;
		do {
			System.out.println("O que você deseja fazer?");
			System.out.println("1 - Enviar um email");
			System.out.println("2 - Consultar informações");
			System.out.println("0 - Sair");
			opcao = sc.nextLine();
			switch (opcao) {
			case "1":
				System.out.println("Para quem deseja enviar um email?");
				System.out.println("1 - Aluno");
				System.out.println("2 - Funcionário");
				System.out.println("3 - Professor");
				opcao = sc.nextLine();
				switch (opcao) {
				case "1":
					aluno.comparecerSecretaria(); // metodo que manda email para aluno
					break;
				case "2":
					funcionario.realizarExameMedico();// metodo que manda email funcionario
					break;
				case "3":
					professor.informarPeriodoFerias();// metodo que manda email para professor
					break;
				case "0":
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
				break;
			case "2":
				System.out.println("Qual informação você deseja consultar?");
				System.out.println("1 - Alunos matriculados");
				System.out.println("2 - Funcionários cadastrados");
				System.out.println("3 - Professores contratados");
				opcao = sc.nextLine();
				switch (opcao) {
				case "1":
					// Consultar alunos matriculados
					System.out.println("Consultando alunos matriculados...");
					aluno.imprimirDadosAluno();
					break;
				case "2":
					// Consultar funcionários cadastrados
					System.out.println("Consultando funcionários cadastrados...");
					funcionario.imprimirDadosFuncionario();
					break;
				case "3":
					// Consultar professores contratados
					System.out.println("Consultando professores contratados...");
					professor.imprimirDadosProfessor();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
				}
				break;
			case "0":
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");

			}
		} while (!opcao.equals("0"));
	}
}
