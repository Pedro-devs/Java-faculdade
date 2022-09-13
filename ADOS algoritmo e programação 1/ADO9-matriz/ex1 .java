
public class Main {

	public static void main(String[] args) {
		int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
		int matrizDois[][]={{1,2,3},{4,5,6},{7,8,9}};
		int soma[][]=new int[matriz.length][matriz.length];
		
		for(int i=0; i<matriz.length; i++){     //i=linhas
		for(int j=0; j<matriz.length; j++){     //j=colunas
		
		soma[i][j]=matriz[i][j]+matrizDois[i][j];
		
		System.out.print("|"+soma[i][j]);
		}
		System.out.println();
		}
		
}
}
//Faça um programa para somar duas matrizes


