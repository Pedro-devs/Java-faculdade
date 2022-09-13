import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor pra A");
		int A = sc.nextInt();
		System.out.println("Informe um valor pra B");
		int B = sc.nextInt();
		
		int soma= A*2;
		int soma2=B*2;
		int soma3=soma+soma2;
		int soma4=(A*2)+(B*2);
		
			System.out.println("hipotenusa do triângulo é "+ soma3);
			System.out.println("A raiz quadrada de " + soma3 + " é " + Math.sqrt(soma4));
		
	}
}
