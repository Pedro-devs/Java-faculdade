import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Por favor informe o número de cadastro");
		int cad = sc.nextInt();
		System.out.println("número de horas trabalhadas");
		int ht = sc.nextInt();
		System.out.println("O numero é " + cad);
		System.out.println("Valor recebido por hora trabalhada é R$5");
		
		System.out.println("O salario será "+ ht*5);
	}
}
//Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas,
//o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o
//salário do funcionário.

