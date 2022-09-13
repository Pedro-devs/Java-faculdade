package lista4;

public class ex34 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int soma=0;
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]= linha;
					soma+=matrix[linha][coluna];
					
				}
			}
		
		
				System.out.println("A soma de todos os elementos da matriz é: "+soma);
		}

}