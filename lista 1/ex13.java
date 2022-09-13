import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor para n1");
		int n1=sc.nextInt();
		System.out.println("Informe um valor para n2");
		int n2=sc.nextInt();
		System.out.println("Informe um valor para n3");
		int n3=sc.nextInt();
		
		if((n1>n2)&&(n1>n3)){
		    System.out.println("O maior numero é " + n1);
		}
		if((n2>n1)&&(n2>n3)){
		    System.out.println("O maior numero é " + n2);
		}
		if((n3>n1)&&(n3>n2)){
		    System.out.println("O maior numero é " + n3);
		}
	}
}
//Fazer um algoritmo que leia três números e imprime o maior deles
