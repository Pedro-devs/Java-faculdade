package Exercicios;

import java.util.Scanner;


public class teste {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		VetorObjeto jogos = new VetorObjeto(6); // criando um vetor de jogos com capacidade inicial de 10 elementos

		

		int opcao = 0;
		do {
			System.out.println("\n========== MENU DE OPÇÕES ==========");
			System.out.println("1. Adicionar jogo");
			System.out.println("2. Remover jogo");
			System.out.println("3. Buscar jogo");
			System.out.println("4. Mostrar todos os jogos");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				sc.nextLine();
				System.out.print("Digite o nome do jogo: ");
				String nome = sc.nextLine();
				System.out.print("Digite o preço do jogo: ");
				String preco = sc.nextLine();
				System.out.print("Digite a plataforma do jogo: ");
				String plataforma = sc.nextLine();
				jogos.adiciona(new jogos(nome, preco, plataforma));
				System.out.println("Jogo adicionado com sucesso!");
				break;
			case 2:
				System.out.print("Digite a posição do jogo que deseja remover: ");
				int posicao = sc.nextInt();
				jogos.remove(posicao);
				System.out.println("Jogo removido com sucesso!");
				break;
			case 3:
				System.out.print("Digite o nome do jogo que deseja buscar: ");
				sc.nextLine();
				String nomeBusca = sc.nextLine();
				int posicaoBusca = jogos.busca1(new jogos(nomeBusca, "", ""));
				if (posicaoBusca != -1) {
					jogos elementoBusca = (jogos) jogos.busca(posicaoBusca);
					System.out.println("Jogo encontrado: " + elementoBusca.toString());
				} else {
					System.out.println("Jogo não encontrado!");
				}
				break;
			case 4:
				System.out.println("Lista de jogos: ");
				for (int i = 0; i < jogos.tamanho(); i++) {
					jogos elemento = (jogos) jogos.busca(i);
					System.out.println(elemento.toString());
				}
				break;
			case 5:
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 5);

		sc.close();
	}
}
