import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    //Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N
		System.out.println("Informe um valor para n");
		int n1 = sc.nextInt();
		
		int i = 0;
		int soma = 0;
		while(i<n1){
		    i++;
		    soma =soma+ i;
		}
		System.out.print(soma);
		
		
		
	}
}
//Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
//resultado obtido. Use o laço WHILE.

