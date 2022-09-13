
public class Main
{
	public static void main(String[] args) {
		
	int matriz[][]=new int[3][3];
	
	for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz.length;j++){	
		matriz[i][j]=i+j;
		System.out.print("|"+matriz[i][j]);
	}
	System.out.println();
	}
		
}
}
//Dada uma matriz de tamanho N x M, de números inteiros, fazer um programa que preenche os elementos
//da matriz com a soma do número da linha com o número da coluna em que se encontra. Imprimir a matriz.
