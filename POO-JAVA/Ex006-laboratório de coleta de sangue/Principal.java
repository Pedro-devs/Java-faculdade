package EstudarJava;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar paciente");
            System.out.println("2. Remover paciente");
            System.out.println("3. Listar pacientes");
            System.out.println("4. Sair");
            opcao = sc.nextInt();
             // Lê o caractere de nova linha deixado pelo nextInt()
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do paciente:");
                    String nome = sc.next();
                    fila.adicionarPaciente(nome);
                    break;
                case 2:
                    System.out.println(fila.removerPaciente());
                    break;
                case 3:
                    System.out.println(fila.listarPacientes());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}
