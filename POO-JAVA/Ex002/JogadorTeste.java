package Exercicios;

import java.util.Scanner;

public class JogadorTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Jogador jogador = new Jogador();

		System.out.println("Digite o nome do jogador");
		jogador.nome = sc.next();
		System.out.println("Digite o peso do jogador");
		jogador.peso = sc.nextFloat();
		System.out.println("Digite a idade jogador");
		jogador.idade = sc.nextInt();
		System.out.println("Digite a altura do jogador");
		jogador.altura = sc.nextFloat();
		System.out.println("Digite a posição do jogador [defesa],[meio-campo],[atacante]");
		jogador.posicao = sc.next();
		System.out.println("Digite a nacionalidade do jogador");
		jogador.nacionalidade = sc.next();
		
		jogador.imprimirDados();

	}

}
