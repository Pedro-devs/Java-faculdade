package lista4;

public class ex37 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int nuloL=0;
		int nuloC=0;
		
		matrix[0][0]=0;
		matrix[0][1]=0;
		matrix[0][2]=0;
		matrix[1][0]=0;
		matrix[2][0]=0;
		
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= 0;
				}
			}
		
		for (int linha=0; linha<matrix.length;linha++) {
			
			
				if(matrix[linha][0]==0 && matrix[linha][1]==0 && matrix[linha][2]==0) {
					nuloC++;
				}
				
				if(matrix[0][linha]==0 && matrix[1][linha]==0 && matrix[2][linha]==0) {
					nuloL++;
				}
		}
		
		System.out.println("Tem "+nuloL+" linha(s) nula(s) e "+nuloC+" coluna(s) nula(s) dentro da matriz");
		
		
	}

}