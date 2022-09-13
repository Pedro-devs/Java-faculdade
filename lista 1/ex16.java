import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("Hora inicial");
        int inicio = entrada.nextInt();
        System.out.println("Hora Final");
        int fim = entrada.nextInt();
        int duracao = 24 - (24 + inicio - fim) % 24;
        if (inicio == fim) {
            System.out.println("O JOGO DUROU 24 HORAS");
        } else {
            System.out.printf("O JOGO DUROU %d HORAS\n", duracao);
	}
}
}
