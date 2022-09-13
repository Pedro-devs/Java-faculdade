import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Informe um valor para A");
		int A = sc.nextInt();
		System.out.println("Informe um valor para B");
		int B = sc.nextInt();
		System.out.println("Informe um valor para C");
		int C = sc.nextInt();
		System.out.println("Informe um valor para D");
		int D = sc.nextInt();
		
		if(((B>C)&&(D>A)&&(C+D>A+B))){
		    if((C>0)&&(D>0))
		    System.out.println("Valores aceitos");
		} else {                    // senão escrever "Valores não aceitos".
            System.out.println("Valores nao aceitos");
        
		}
		
		
	}
}
