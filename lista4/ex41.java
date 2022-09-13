package lista4;
import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int matrix[][]= new int [3] [3];
		int maior=-1000000000;
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			for(int coluna=0; coluna<matrix[linha].length;coluna++)
			{
				System.out.println("De o numero da linha "+(linha+1)+" e da coluna "+(coluna+1));
				matrix[linha][coluna]=sc.nextInt();
				if(matrix[linha][coluna]>maior) {
					maior=matrix[linha][coluna];
				}
				
			}
		}
		
		System.out.println("O maior numero da matriz é: "+maior);

	}

}