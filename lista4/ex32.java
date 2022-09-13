package lista4;

public class ex32 {

	public static void main(String[] args) {
		int matrix[][]= new int [3] [3];
		int soma[]=new int[1];
		
		
		
		for (int linha=0; linha<matrix.length;linha++) {
				
				for(int coluna=0; coluna<matrix[linha].length;coluna++)
				{
					matrix[linha][coluna]=linha;
					
					if(coluna%2!=0) {
					soma[0]+= matrix[linha][coluna];
					}
					
				}
			}
		
		for (int i=0; i<1;i++) {
			System.out.println("A soma da "+(i+1)+"° coluna é: "+soma[i]);
			
		}

	}

}