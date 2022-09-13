import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int contador = 1;
		System.out.println("Insira um valor para N: ");
		int N = leia.nextInt();
		do{
		    int res =contador*N;
		    System.out.println(contador + " X " + N + " = "+ res);
		    
		    contador = contador +1;
		}
		while(contador <=9);
		
	}
}
