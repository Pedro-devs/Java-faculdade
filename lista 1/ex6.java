import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Escreva um valor para A");
		float A = sc.nextFloat();
		System.out.println("Escreva um valor para B");
		float B = sc.nextFloat();
		System.out.println("Escreva um valor para C");
		float C = sc.nextFloat();
		
		float soma1= (A*B)/2;
		double soma2= C*3.14;
		float soma3= (A+B)*C;
		float soma4= B*2;
		float soma5= A*B;
		float soma6= A+B;
		System.out.println("a área do triângulo retângulo é " + soma1);
		System.out.println("a área do círculo  é " + soma2);
		System.out.println("a área do trapézio é " + soma3);
		System.out.println("a área do quadrado é " + soma4);
		System.out.println("a área do retângulo é " + soma5);
		System.out.println("o perímetro do retângulo é " + soma6);
		
		
	}
}
//Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (π = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
//f) o perímetro do retângulo que tem lados A e B.


