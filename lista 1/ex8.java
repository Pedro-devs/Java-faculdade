import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("informe um valor para n1");
		int n1=sc.nextInt();
		System.out.println("informe um valor para n2");
		int n2=sc.nextInt();
		System.out.println("informe um valor para n3");
		int n3=sc.nextInt();
		System.out.println("informe um valor para n4");
		int n4=sc.nextInt();
		
		int media=(n1+n2+n3+n4)/4;
		System.out.println("A media aritmetica dos valores insiridos é " + media);
		
		
		
		
	}
}
//Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números
