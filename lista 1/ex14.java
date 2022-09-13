import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Informe um valor para n1");
		int n1=sc.nextInt();
		System.out.println("Informe um valor para n2");
		int n2=sc.nextInt();
		
		if(n1>n2){
		    System.out.println("o resultado da divisao é " + n1/n2);
		}
		if(n2>n1){
		    System.out.println("o resultado da divisao é " + n2/n1);
		}
	}
}
//Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor
