package lista4;
import java.util.Scanner;

public class ex40 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int matrix[][]= new int [3] [3];
		System.out.println("De um numero: ");
		int n =sc.nextInt();
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= linha;
					
					if(n==matrix[linha][coluna]) {
						System.out.println("O numero está dentro da matriz e está na linha "+linha+" e na coluna "+coluna);
						break;
					}
					else if( linha==matrix.length-1 && coluna == matrix[linha].length-1) {
						System.out.println("O numero não está dentro da matriz");
					}
				}
			}
		
		


	}

}