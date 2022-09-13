package lista4;

public class ex30 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int vetor[]= {1,2,3};
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= vetor[linha];
				}
			}
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			for(int coluna=0; coluna<matrix[linha].length;coluna++)
			{
				System.out.print(matrix[linha][coluna]+"\t");
			}
			System.out.println();
		}

	}

}