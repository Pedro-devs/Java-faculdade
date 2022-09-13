package lista4;

public class ex38 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int neg=1;
		int ordem=1;
		int n=1;
		
		matrix[0][0]=1;
		matrix[0][1]=4;
		matrix[0][2]=5;
		matrix[1][0]=0;
		matrix[1][1]=2;
		matrix[1][2]=6;
		matrix[2][0]=0;
		matrix[2][1]=0;
		matrix[2][2]=3;
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			for(int coluna=0; coluna<matrix[linha].length;coluna++)
			{
				if(linha-n==-1||linha+n==3) {
					n=0;
				}
				
				if(linha==coluna && matrix[linha-n][coluna]>0 && matrix[linha+n][coluna]==0) {
				System.out.println("O "+(ordem)+"° numero da parte superior da diagonal principal é: "+matrix[linha][coluna]);
				ordem++;
				
				}
			}
			n=1;
		}

	}

}