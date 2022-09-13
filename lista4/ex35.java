package lista4;

public class ex35 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int neg=1;
		float soma=0;
		float med=0;
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= linha*neg;
					neg*=-1;
					
					if(matrix[linha][coluna]>0) {
						soma+=matrix[linha][coluna];
						med++;
					}
				}
			}
		
		System.out.println("A media de todos os numeros positivos da matriz é: "+(float)soma/med);

	}

}