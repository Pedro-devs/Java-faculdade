import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("informe um valor para n1");
	   int n1 = sc.nextInt();
	   if (n1 > 100) {
	       n1 = (n1 + 150);
	         System.out.println("n1 + 150= " + n1);
	   }
	}
}
