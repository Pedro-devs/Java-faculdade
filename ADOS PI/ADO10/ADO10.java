import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void dica(int palpite, int numero, int tentativas){
        if(palpite > numero){
            System.out.println("Seu palpite é maior que o número sorteado.");
        } else {
            if(palpite < numero){
                    System.out.println("Seu palpite é menor que o número sorteado.");
            } else {
                System.out.println("Parabéns, você ganhou o jogo! O número era " + numero);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
            }
        }
            
    }
    
    public static void main(String[] args) {
        int palpite=0, 
            sorteado, 
            tentativas=0;
        
        Scanner entrada = new Scanner(System.in);
        
        Random geradorDeAleatorios = new Random();
        sorteado = geradorDeAleatorios.nextInt(100) + 1;
        System.out.println("Número entre 1 e 100 sorteado!");
        
        do{
            System.out.printf("\n\n\n\n-----------------\n");
            System.out.println("Número de tentativas: " + tentativas);
            
            System.out.print("Qual seu palpite: ");
            palpite = entrada.nextInt();
            
            tentativas++;
            
            dica(palpite,sorteado, tentativas);
        }while (palpite != sorteado);

    }

}
//Um jogo bem simples consiste em tentar adivinhar um valor inteiro aleatório
//escolhido entre 1 e 100 por um computador. O usuário/jogador terá apenas 5
//chances para tentar adivinhar o valor. A cada tentativa do jogador, caso ele não
//acerte, o programa deve informar se o valor digitado é maior ou menor que o
//valor escolhido pelo computador. E caso o valor digitado pelo jogador tenha
//diferença em módulo igual a 1 com o valor correto deverá ser impresso “TÁ
//QUENTE!” (por exemplo, o computador escolheu 42 e o jogador digitou 41
//ou 43). No final, deverá ser impresso “Parabéns, você ganhou o jogo!”, se o
//jogador conseguiu acertar o valor escolhido pelo computador, ou “Game
//Over!”, caso contrário.