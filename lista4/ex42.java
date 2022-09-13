package lista4;

import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int matrix[][]= new int [3] [3];
		int maior=-1000000000;
		int matrix2[][]= new int [3] [3];
		int maior2=-1000000000;
		
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
		
		for (int linha=0; linha<matrix2.length;linha++) {
			
			for(int coluna=0; coluna<matrix2[linha].length;coluna++)
			{
				System.out.println("De o numero da linha "+(linha+1)+" e da coluna "+(coluna+1));
				matrix2[linha][coluna]=sc.nextInt();
				if(matrix2[linha][coluna]>maior2) {
					maior2=matrix2[linha][coluna];
				}
				
			}
		}
		
		System.out.println("O produto dos maiores numeros das 2 matrizes é: "+maior*maior2);

	}

}