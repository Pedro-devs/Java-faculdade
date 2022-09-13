import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Insira um valor para saber seu fatorial: ");
        int n = input.nextInt();

        int n1 = n; //Váriavel só pra mostrar o número digitado no final.

        for (int i = n - 1; i > 0; i --){
            n = ni; //Ex: 54 (n-1) = 20; 203 (i--) = 60; 602 = 120; 120*1 = 120.
        }

        System.out.printf("%d! = %d", n1, n);
    }
}