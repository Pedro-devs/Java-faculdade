package lista4;

public class ex33 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int neg=1;
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= linha*neg;
					neg*=-1;
				}
			}
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			for(int coluna=0; coluna<matrix[linha].length;coluna++)
			{
				if(matrix[linha][coluna]<0) {
				System.out.println("Um numero negativo da matriz é: "+matrix[linha][coluna]);
				
				}
			}
		}

	}

}