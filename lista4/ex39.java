package lista4;

public class ex39 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int matrix2[][]= new int [3] [3];
		int matrixR[][]= new int [3] [3];
		
		
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= linha;
				}
			}
		
		for (int linha=0; linha<matrix2.length;linha++) {
			
			for(int coluna=0; coluna<matrix2[linha].length;coluna++)
			{
				matrix2[linha][coluna]= coluna;
			}
		}
		
		for (int linha=0; linha<matrixR.length;linha++) {
			
			for(int coluna=0; coluna<matrixR[linha].length;coluna++)
			{
				matrixR[linha][coluna]=matrix2[linha][coluna]*matrix[linha][coluna];
			}
		}
		
		for (int linha=0; linha<matrixR.length;linha++) {
			
			for(int coluna=0; coluna<matrixR[linha].length;coluna++)
			{
				System.out.print(matrixR[linha][coluna]+"\t");
			}
			System.out.println();
		}

	}

}