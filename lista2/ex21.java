import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int soma = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Insira um número para saber se ele é perfeito: ");
        int n = input.nextInt();

        System.out.print("Divisores: ");

        for (int i = 1; i != n; i++) {
            if (n % i == 0) {
                System.out.printf("%d; ", i);
                soma += i;
            }
        }

        if (soma == n){
            System.out.printf("\nO número %d é perfeito.", n);
        }

        else {
            System.out.printf("\nO número %d não é perfeito.", n);
        }

    }
}
//Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores
//positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito,
//pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é
//perfeito ou não. Utilize o laço que lhe for mais conveniente.