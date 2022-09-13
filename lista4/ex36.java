package lista4;

public class ex36 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int neg=1;
		int ordem=1;
		
		
		
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
				if(linha==coluna) {
				System.out.println("O "+(ordem)+"° da diagonal principal é: "+matrix[linha][coluna]);
				ordem++;
				
				}
			}
		}

	}

	}