import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        float soma = 1f;


        for (float i = 2f; i <= 20f; i++) {
            soma += (1/i);
        }

        System.out.print(soma);
    }
}
//Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.