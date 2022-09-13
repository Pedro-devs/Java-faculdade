import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int operacao = 0;

        Scanner input = new Scanner (System.in);
        System.out.print("Insira seu saldo inicial: ");
        float saldo = input.nextFloat();

        do {

            System.out.printf("Qual operação deseja realizar?\n [1] DEPÓSITO\n [2] SAQUE\n [3] SAIR\n");
            operacao = input.nextInt();

            if (operacao == 3) {
                break;
            }

            System.out.print("Insira o valor: ");
            float valor = input.nextFloat();

            switch (operacao) {
                case 1:
                    saldo += valor;
                    break;
                case 2:
                    saldo -= valor;
                    break;
            }
        }
            while (true);

            if (saldo == 0){
                System.out.printf("CONTA ZERADA\n Saldo = %.1f", saldo);
            }
            else if (saldo < 0) {
                System.out.printf("CONTA ESTOURADA\n Saldo = %.1f", saldo);
            }
            else {
                System.out.printf("CONTA PREFERENCIAL\n Saldo = %.1f", saldo);
            }
    }
}
//Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
//operações de depósito e saque.
//O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
//Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
//realizadas até que o usuário digite o código de operação “3”.
//Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
//mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
//CONTA PREFERENCIAL (se o saldo for positivo).
//Utilize o laço DO-WHILE.