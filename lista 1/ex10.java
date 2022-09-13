import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe seu nome vendedor !");
		String vendedor=sc.nextLine();
		System.out.println("Digite o salario fixo do vendedor");
	    int salario= sc.nextInt();
		System.out.println("Digite o valor total vendido do vendedor em dinheiro");
		int vendas = sc.nextInt();
		double comissao = 0.15;
		
		double vendascomiss= salario +(vendas*comissao);
		System.out.println("Total à receber no final do mês " + vendascomiss);
	}
}
//Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
//no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
//calcular e imprimir o total a receber no final do mês.

