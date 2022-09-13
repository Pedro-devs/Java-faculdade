import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor para x");
		int x =sc.nextInt();
		int z=x;
		for(x=1;x<=z;x+=2){
		    System.out.println(x);
		}
		
	}
}
