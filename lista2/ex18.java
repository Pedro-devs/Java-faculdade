import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n = 0;

        do {
            System.out.println("Digite a quantidade de termos que quer ver: ");
            n = input.nextInt();
            if (n > 46){
                System.out.println("Valor inválido!");
            }
        }

        while (n > 46);

        int p1 = 0;
        int p2 = 1;
        int p3 = 0; 

        System.out.printf("%d, %d", p1, p2);

        for (int i = 0; i < n - 2; i++){
            p3 = p1+p2;
            p1 = p2;
            p2 = p3;

            System.out.printf(", %d", p3);
        }


    }
}
//A seguinte sequência de números 0, 1, 1, 2, 3, 5, 8, 13, 21... é conhecida como série de Fibonacci. Nessa
//sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo que
//leia um inteiro N (onde N < 46) e mostre os N primeiros números dessa série. Utilize o laço que lhe for mais
//conveniente.